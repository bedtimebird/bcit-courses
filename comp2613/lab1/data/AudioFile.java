/**
 * Project: a00964363
 * File: AudioFile.java
 * Date: Apr 17, 2019
 * Time: 11:39:55 AM
 */
package lab1.data;

import lab1.data.music.MusicMedia;
import lab1.io.FileManager;
import review.Checks;

/**
 * @author Mike Bird, A00964363
 *
 */
public class AudioFile extends MusicMedia implements FileManager {

	private String fileName;
	private double fileSize;

	/*
	 * Default Constructor
	 */
	public AudioFile(String artist, String title) {
		super(artist, title);
	}

	/**
	 * @param artist
	 * @param title
	 * @param fileName
	 * @param fileSize
	 */
	public AudioFile(String artist, String title, String fileName, double fileSize) {
		super(artist, title);
		setFileName(fileName);
		setFileSize(fileSize);
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = Checks.validString(fileName);
	}

	/**
	 * @return the fileSize
	 */
	public double getFileSize() {
		return fileSize;
	}

	/**
	 * @param fileSize
	 *            the fileSize to set
	 */
	public void setFileSize(double fileSize) {
		if (fileSize > 0) {
			this.fileSize = fileSize;
		} else {
			System.out.println("File size must be a positive value");
		}
	}

	@Override
	public void delete(String fileName, String location) {
		System.out.println("Deleting \"" + fileName + "\" from \"" + location + "\" folder.");
	}

	@Override
	public void save(String fileName, String location) {
		System.out.println("Saving \"" + fileName + "\" from \"" + location + "\" folder.");
	}

	/**
	 * Plays an audio file.
	 */
	@Override
	public void play() {
		System.out.println("Playing \"" + getFileName() + "\" .");
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AudioFile [fileName=" + fileName + ", fileSize=" + fileSize + ",toString()=" + super.toString() + "]";
	}

}
