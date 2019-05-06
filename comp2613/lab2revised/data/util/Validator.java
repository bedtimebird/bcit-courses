/**
 * Project: a00964363
 * File: Validator.java
 * Date: Apr 27, 2019
 * Time: 10:43:34 AM
 */
package lab2revised.data.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mike Bird, A00964363
 *
 */
public class Validator {

	public static String emailAddress(String emailAddress) {
		Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher emailMatch = emailPattern.matcher(emailAddress);

		if (emailMatch.matches()) {
			return emailAddress;
		} else {
			return "N/A";
		}
	}

	public static String postalCode(String postalCode) {
		Pattern postalCodePattern = Pattern.compile("^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$");
		Matcher postalCodeMatch = postalCodePattern.matcher(postalCode);

		if (postalCodeMatch.matches()) {
			return postalCode;
		} else {
			return "N/A";
		}
	}

	public static String phoneNumber(String phoneNumber) {
		Pattern phoneNumberPattern = Pattern.compile("^([(][0-9][0-9][0-9][)])\\s([0-9][0-9][0-9][-][0-9][0-9][0-9][0-9])$");
		Matcher phoneNumberMatch = phoneNumberPattern.matcher(phoneNumber);

		if (phoneNumberMatch.matches()) {
			return phoneNumber;
		} else {
			return "N/A";
		}
	}

	public static String validString(String input) {
		if (input == null || input.trim().isEmpty()) {
			return "unknown";
		} else {
			return input;
		}
	}

}
