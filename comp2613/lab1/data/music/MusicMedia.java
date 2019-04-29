/**
 * Project: a00964363
 * File: MusicMedia.java
 * Date: Apr 17, 2019
 * Time: 11:41:52 AM
 */
package lab1.data.music;

import review.Checks;

/**
 * @author Mike Bird, A00964363
 *
 */
public abstract class MusicMedia {

	private String artist;
	private String title;

	/**
	 * @param artist
	 * @param title
	 */
	public MusicMedia(String artist, String title) {
		setArtist(artist);
		setTitle(title);
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist
	 *            the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = Checks.validString(artist);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = Checks.validString(title);
	}

	/*
	 * abstract method play()
	 */
	public abstract void play();

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MusicMedia [artist=" + artist + ", title=" + title + "]";
	}

}
