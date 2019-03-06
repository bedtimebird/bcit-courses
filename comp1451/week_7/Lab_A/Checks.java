/**
 * @author A00964363
 * various checks used throughout program
 */
public class Checks {
  public static final int MIN_STRING = 1;
  public static final int MAX_STRING = 50;  

/**
 * method to format Strings to capitalize first letter of each word
 * @param word String 
 * @return st String
 */
	public static String formatString(String word) {
	   word = word.toLowerCase();
	   char[] charArray = word.toCharArray();
	   for (int i=0; i<charArray.length; i++){
	     if (i==0 && charArray[i] != ' ' || charArray[i] != ' ' && charArray[i-1] == ' ') {
	       charArray[i] = Character.toUpperCase(charArray[i]);
	     }
	   }
	   String st = new String(charArray);
	   return st;
	 }
/**
 * method to check length of string 
 * throw illegalArgument if it does not conform 
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

/**
 * method to check if input int is greater than AMOUNT_GREATER_THAN
 * throw illegalArgument if it does not conform 
 * @param pages int 
 * @param AMOUNT_GREATER_THAN int
 * @param AMOUNT_LESS_THAN int
 * @return pages int 
 */
	public static int lengthInt(int number, int MIN_INT, int MAX_INT) {
	 if (number > MIN_INT && number <= MAX_INT) {
	   return number;
	 } else {
	   throw new IllegalArgumentException("Value entered must be greater than " + MIN_INT + " and less than " + MAX_INT + ".");
	 }
	}

	public static int minInt(int number) {
	 if (number > 0) {
	   return number;
	 } else {
	   throw new IllegalArgumentException("Value entered must be greater than 0.");
	 }
	}  
	
  public static double lengthDouble(double number, double MIN_DOUBLE, double MAX_DOUBLE) {
	 if (number > MIN_DOUBLE && number <= MAX_DOUBLE) {
	   return number;
	 } else {
	   throw new IllegalArgumentException("Value entered must be greater than " + MIN_DOUBLE + " and less than " + MAX_DOUBLE + ".");
	 }
	}

  public static double minDouble(double number) {
	 if (number > 0) {
	   return number;
	 } else {
	   throw new IllegalArgumentException("Value entered must be greater than 0.");
	 }
	}  
	}
