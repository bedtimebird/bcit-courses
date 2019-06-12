package a00123456;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

/**
 * To demonstrate knowledge of threading
 * 
 * @author Sam Cirka, A00123456
 *
 */
public class SystemBenchmark {

	static {
		configureLogging();
	}

	private static final Logger LOG = LogManager.getLogger();
	private static final String LOG4J_CONFIG_FILENAME = "log4j2.xml";
	private static int MAX = 1_000;

	private int threadCount;
	static int[] iterations = new int[] { 1, 10, 100 };
	static long[] duration1 = new long[iterations.length];
	static long[] duration2 = new long[iterations.length];

	private static void configureLogging() {
		ConfigurationSource source;
		try {
			source = new ConfigurationSource(new FileInputStream(LOG4J_CONFIG_FILENAME));
			Configurator.initialize(null, source);

		} catch (IOException e) {
			System.out.println(String.format("Can't find the log4j logging configuration file %s.", LOG4J_CONFIG_FILENAME));
		}
	}

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Instant startTime = Instant.now();
		LOG.info("Start: " + startTime);

		new SystemBenchmark().run();

		Instant endTime = Instant.now();
		LOG.info("End: " + endTime);
		LOG.info(String.format("Duration: %d ms", Duration.between(startTime, endTime).toMillis()));
		LOG.info("=== Results ===");
		StringBuilder durationsString = new StringBuilder();
		for (int i = 0; i < duration1.length; i++) {
			durationsString.append(String.format("%10d\t", iterations[i]));
		}
		LOG.info(String.format("                           Threads:    %s", durationsString));

		durationsString = new StringBuilder();
		for (int i = 0; i < duration1.length; i++) {
			durationsString.append(String.format("%10d\t", duration1[i]));
		}
		LOG.info(String.format("Test 1 - join in thread start loop:    %s", durationsString));

		durationsString = new StringBuilder();
		for (int i = 0; i < duration2.length; i++) {
			durationsString.append(String.format("%10d\t", duration2[i]));
		}
		LOG.info(String.format("Test 2 - join after thread start loop: %s", durationsString));
	}

	/**
	 * Lab8 constructor
	 */
	private SystemBenchmark() {
	}

	public synchronized void decreaseThreadCount() {
		threadCount--;
	}

	public synchronized void setThreadCount(int count) {
		threadCount = count;
	}

	public synchronized int getThreadCount() {
		return threadCount;
	}

	/**
	 * Populate the customers and print them out.
	 */
	private void run() {
		LOG.info("Information about my OS");
		LOG.info("Name: " + System.getProperty("os.name"));
		LOG.info("Version: " + System.getProperty("os.version"));
		LOG.info("Architecture: " + System.getProperty("os.arch"));
		LOG.info("CPUs:" + Runtime.getRuntime().availableProcessors());

		try {
			for (int testNumber = 0; testNumber < iterations.length; testNumber++) {
				test1(testNumber + 1, iterations[testNumber]);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			for (int testNumber = 0; testNumber < iterations.length; testNumber++) {
				test2(testNumber + 1, iterations[testNumber]);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void test1(int testNumber, int threadCount) throws InterruptedException {
		LOG.info(String.format("=== Start test1 %d: Run %,d iterations with %d threads  ===", testNumber, MAX, threadCount));
		Instant startTime = Instant.now();
		LOG.info("Start: " + startTime);

		setThreadCount(threadCount);
		int max = MAX / threadCount;

		Thread thread = null;
		for (int i = 0; i < threadCount; i++) {
			thread = new HotThread(i, max);
			thread.start();
			thread.join(3600000); // wait up to an hour so this can be debugged
		}

		Instant endTime = Instant.now();
		LOG.info("End: " + endTime);
		long duration = Duration.between(startTime, endTime).toMillis();
		LOG.info(String.format("=== Test %d - join in thread start loop: %d milliseconds ===", testNumber, duration));
		duration1[testNumber - 1] = duration;
	}

	private void test2(int testNumber, int threadCount) throws InterruptedException {
		LOG.info(String.format("=== Start test2 %d: Run %,d iterations with %d threads  ===", testNumber, MAX, threadCount));
		Instant startTime = Instant.now();
		LOG.info("Start: " + startTime);

		setThreadCount(threadCount);
		int max = MAX / threadCount;

		Thread[] threads = new Thread[threadCount];
		Thread thread = null;
		for (int i = 0; i < threadCount; i++) {
			thread = new HotThread(i, max);
			threads[i] = thread;
			thread.start();
		}

		for (int i = 0; i < threads.length; i++) {
			thread.join(3600000); // wait up to an hour so this can be debugged
		}

		Instant endTime = Instant.now();
		LOG.info("End: " + endTime);
		long duration = Duration.between(startTime, endTime).toMillis();
		LOG.info(String.format("=== Test %d - join after thread start loop: %d milliseconds ===", testNumber, duration));
		duration2[testNumber - 1] = duration;
	}

}
