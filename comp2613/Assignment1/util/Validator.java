/**
 * Project: Assignment1_start
 * File: Validator.java
 * Date: May 27, 2019
 * Time: 7:03:43 PM
 */
package a00964363.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mike Bird, A00964363
 *
 */
public class Validator {

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String YYYYMMDD_PATTERN = "(20\\d{2})(\\d{2})(\\d{2})"; // valid for years 2000-2099

	private static Pattern emailPattern;
	private static Pattern yyyymmddPattern;

	private Validator() {
	}

	/**
	 * Validate an email string.
	 * 
	 * @param email
	 *            the email string.
	 * @return true if the email address is valid, false otherwise.
	 */
	public static boolean validateEmail(final String email) {
		if (emailPattern == null) {
			emailPattern = Pattern.compile(EMAIL_PATTERN);
		}

		Matcher matcher = emailPattern.matcher(email);
		return matcher.matches();
	}

	public static boolean validateJoinedDate(String yyyymmdd) {
		if (yyyymmddPattern == null) {
			yyyymmddPattern = Pattern.compile(YYYYMMDD_PATTERN);
		}

		Matcher matcher = yyyymmddPattern.matcher(yyyymmdd);
		return matcher.matches();
	}

}
