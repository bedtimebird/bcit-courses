/**
 * Project: a00964363
 * File: VinylRecordAlbum.java
 * Date: Apr 17, 2019
 * Time: 11:43:18 AM
 */
package lab1.data.music;

/**
 * @author Mike Bird, A00964363
 *
 */
public class VinylRecordAlbum extends MusicMedia {
	private static final int STANDARD_WEIGHT = 120;
	private int numberOfTracks;
	private int weight;

	/**
	 * @param artist
	 * @param title
	 * @param numberOfTracks
	 */
	public VinylRecordAlbum(String artist, String title, int numberOfTracks) {
		super(artist, title);
		setNumberOfTracks(numberOfTracks);
	}

	/**
	 * @param artist
	 * @param title
	 * @param numberOfTracks
	 * @param weight
	 */
	public VinylRecordAlbum(String artist, String title, int numberOfTracks, int weight) {
		super(artist, title);
		setNumberOfTracks(numberOfTracks);
		setWeight(weight);
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
			System.out.println("Number of tracks must be a positive value.");
		}
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		if (weight < STANDARD_WEIGHT) {
			System.out.println("Weight entered is less than Standard Weight. Value not changed.");
		} else {
			this.weight = weight;
		}
	}

	/**
	 * Plays a vinyl record album.
	 */
	@Override
	public void play() {
		System.out.println("Playing \"" + getTitle() + "\" record.");
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VinylRecordAlbum [numberOfTracks=" + numberOfTracks + ", weight=" + weight + ",toString()=" + super.toString() + "]";
	}

}
