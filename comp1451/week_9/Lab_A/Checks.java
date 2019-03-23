package ca.bcit.comp1451.Session9LabA;

public class Checks {
	public static final int MIN_STRING = 1;
	public static final int MAX_STRING = 50;
	public static final int MIN_DOUBLE = 0;
	public static final int MIN_INT = 0;

	public static int minInt(int number) {
		if (number > MIN_INT) {
			return number;
		} else {
			throw new IllegalArgumentException("Value entered must be greater than " + MIN_INT + " .");
		}
	}

	/**
	 * method to check length of string throw illegalArgument if it does not conform
	 * 
	 * @param name String
	 * @return name String
	 */
	public static String lengthString(String name) {
		char[] stringToCharArray = name.trim().toCharArray();
		if (stringToCharArray.length >= MIN_STRING && stringToCharArray.length <= MAX_STRING) {
			return name;
		} else {
			throw new IllegalArgumentException("Invalid input");
		}
	}

	public static String colorInput(String color) {
		String rColor = "";
		switch (color) {
		case "red":
			rColor = "red";
			break;
		case "yellow":
			rColor = "yellow";
			break;
		case "blue":
			rColor = "blue";
			break;
		case "green":
			rColor = "green";
			break;
		case "magenta":
			rColor = "magenta";
			break;
		case "black":
			rColor = "black";
			break;
		default:
			rColor = "black";
			break;
		}
		return rColor;
	}

}

// Valid colors are "red", "yellow", "blue", "green",
//	     * "magenta" and "black".
