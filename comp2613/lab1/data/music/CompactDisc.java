/**
 * Project: a00964363
 * File: CompactDisc.java
 * Date: Apr 17, 2019
 * Time: 11:42:33 AM
 */
package lab1.data.music;

/**
 * @author Mike Bird, A00964363
 *
 */
public class CompactDisc extends MusicMedia {
	private int numberOfTracks;

	/**
	 * Default constructor
	 * 
	 * @param artist
	 * @param title
	 */
	public CompactDisc(String artist, String title) {
		super(artist, title);
	}

	/**
	 * @param artist
	 * @param title
	 * @param numberOfTracks
	 */
	public CompactDisc(String artist, String title, int numberOfTracks) {
		super(artist, title);
		setNumberOfTracks(numberOfTracks);
	}

	/**
	 * @return the numberOfTracks
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * @param numberOfTracks
	 *            the numberOfTracks to set
	 */
	public void setNumberOfTracks(int numberOfTracks) {
		if (numberOfTracks > 0) {
			this.numberOfTracks = numberOfTracks;
		} else {
			System.out.println("Number of tracks must be a positive value");
		}

	}

	/**
	 * Plays a CD
	 */
	@Override
	public void play() {
		System.out.println("Playing \"" + getTitle() + "\" CD.");
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompactDisc [numberOfTracks=" + numberOfTracks + ",toString()=" + super.toString() + "]";
	}

}
