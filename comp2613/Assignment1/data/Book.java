/**
 * Project: Assignment1_start
 * File: Book.java
 * Date: May 27, 2019
 * Time: 6:31:43 PM
 */
package a00964363.data;

/**
 * @author Mike Bird, A00964363
 *
 */
public class Book {

	public static final int ATTRIBUTE_COUNT = 8;

	private long bookID;
	private String isbn;
	private String author;
	private String originalPublicationYear;
	private String originalTitle;
	private double averageRating;
	private int ratingsCount;
	private String imageURL;

	public static class Builder {
		// Required parameters
		private final long bookID;
		private final String isbn;
		// Optional parameters
		private String author;
		private String originalPublicationYear;
		private String originalTitle;
		private double averageRating;
		private int ratingsCount;
		private String imageURL;

		public Builder(long bookID, String isbn) {
			this.bookID = bookID;
			this.isbn = isbn;
		}

		/**
		 * @param author
		 *            the author to set
		 */
		public Builder setAuthor(String author) {
			this.author = author;
			return this;
		}

		/**
		 * @param originalPublicationYear
		 *            the originalPublicationYear to set
		 */
		public Builder setOriginalPublicationYear(String originalPublicationYear) {
			this.originalPublicationYear = originalPublicationYear;
			return this;
		}

		/**
		 * @param originalTitle
		 *            the originalTitle to set
		 */
		public Builder setOriginalTitle(String originalTitle) {
			this.originalTitle = originalTitle;
			return this;
		}

		/**
		 * @param averageRating
		 *            the averageRating to set
		 */
		public Builder setAverageRating(double averageRating) {
			this.averageRating = averageRating;
			return this;
		}

		/**
		 * @param ratingsCount
		 *            the ratingsCount to set
		 */
		public Builder setRatingsCount(int ratingsCount) {
			this.ratingsCount = ratingsCount;
			return this;
		}

		/**
		 * @param imageURL
		 *            the imageURL to set
		 */
		public Builder setImageURL(String imageURL) {
			this.imageURL = imageURL;
			return this;
		}

		public Book build() {
			return new Book(this);
		}

	}

	private Book(Builder builder) {
		bookID = builder.bookID;
		isbn = builder.isbn;
		author = builder.author;
		originalPublicationYear = builder.originalPublicationYear;
		originalTitle = builder.originalTitle;
		averageRating = builder.averageRating;
		ratingsCount = builder.ratingsCount;
		imageURL = builder.imageURL;
	}

	/**
	 * @return the bookID
	 */
	public long getBookID() {
		return bookID;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @return the originalPublicationYear
	 */
	public String getOriginalPublicationYear() {
		return originalPublicationYear;
	}

	/**
	 * @return the originalTitle
	 */
	public String getOriginalTitle() {
		return originalTitle;
	}

	/**
	 * @return the averageRating
	 */
	public double getAverageRating() {
		return averageRating;
	}

	/**
	 * @return the ratingsCount
	 */
	public int getRatingsCount() {
		return ratingsCount;
	}

	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * @param bookID
	 *            the bookID to set
	 */
	public void setBookID(long bookID) {
		this.bookID = bookID;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param originalPublicationYear
	 *            the originalPublicationYear to set
	 */
	public void setOriginalPublicationYear(String originalPublicationYear) {
		this.originalPublicationYear = originalPublicationYear;
	}

	/**
	 * @param originalTitle
	 *            the originalTitle to set
	 */
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	/**
	 * @param averageRating
	 *            the averageRating to set
	 */
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	/**
	 * @param ratingsCount
	 *            the ratingsCount to set
	 */
	public void setRatingsCount(int ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	/**
	 * @param imageURL
	 *            the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", isbn=" + isbn + ", author=" + author + ", originalPublicationYear=" + originalPublicationYear
				+ ", originalTitle=" + originalTitle + ", averageRating=" + averageRating + ", ratingsCount=" + ratingsCount + ", imageURL="
				+ imageURL + "]";
	}

}
