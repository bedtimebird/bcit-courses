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

  public static int checkTimeInput(int unit, int MIN, int MAX){
    if(unit >= MIN && unit <= MAX){
      return unit;
    } else {
      return MIN;
    }
  }

  /**
  * method to check date input is null
  * throw illegalArgument if it does not conform 
  * @param date Date 
  * @return date Date 
  */
    public static Date dateNotNull(Date date){
    if (date != null) {
      return date;
    } else {
      throw new IllegalArgumentException("Date can not be null");
    }
    }

	}
