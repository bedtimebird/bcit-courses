
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleTest {
	public ScheduleTest() {

		Timer timer = new Timer();
		LocalDateTime midnight = LocalDate.now().atStartOfDay();
		PastTask pastTask = new PastTask(midnight);
		timer.schedule(pastTask, toDate(midnight));
		LocalDateTime jan1_2038Midnight = LocalDate.of(2038, 1, 1).atStartOfDay();
		FutureTask futureTask = new FutureTask(jan1_2038Midnight);
		timer.schedule(futureTask, toDate(jan1_2038Midnight));
	}

	public static Date toDate(LocalDateTime localDateTime) {
		return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}

	public static void main(String[] args) {
		System.out.println("Start test");
		new ScheduleTest();
		System.out.println("End test?");
	}

	// inner classes --------------------------------------------------------------------------------------------------

	private class PastTask extends TimerTask {

		private final LocalDateTime dateTime;

		public PastTask(LocalDateTime dateTime) {
			this.dateTime = dateTime;
		}

		@Override
		public void run() {
			System.out.println(String.format("It's %s; %s has passed", LocalDateTime.now().toString(), dateTime.toString()));
		}
	}

	private class FutureTask extends TimerTask {

		private final LocalDateTime dateTime;

		public FutureTask(LocalDateTime dateTime) {
			this.dateTime = dateTime;
		}

		@Override
		public void run() {
			System.out.format("Happy New Year %d!", dateTime.getYear());
		}
	}
}
