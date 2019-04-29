/**
 * Project: a00964363
 * File: FileManager.java
 * Date: Apr 17, 2019
 * Time: 11:43:59 AM
 */
package lab1.io;

/**
 * @author Mike Bird, A00964363
 *
 */
public interface FileManager {
	/*
	 * Delete a file.
	 * @param fileName
	 * name of file stored on local host
	 * @param location
	 * location of file stored on local host
	 */
	void delete(String fileName, String location);

	/*
	 * Save a file.
	 * @param fileName
	 * name of file stored on local host
	 * @param location
	 * location of file stored on local host
	 */
	void save(String fileName, String location);

}
