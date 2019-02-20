import java.util.Scanner;
/**
 * @author A00964363
 * various checks used throughout program
 */
public class Checks {
  public static final int MIN_STRING = 1;
  public static final int MAX_STRING = 50;  
  public static final int AMOUNT_GREATER_THAN = 0;
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
	 public static String stringLength(String name) {
	 char[] stringToCharArray = name.trim().toCharArray();
	   if (stringToCharArray.length >= MIN_STRING && stringToCharArray.length <= MAX_STRING) {
	     return name;
	   } else {
	    return "unknown";
	 }
	}

/**
 * method to check if input int is greater than AMOUNT_GREATER_THAN
 * throw illegalArgument if it does not conform 
 * @param pages int 
 * @return pages int 
 */
	public static int numberLength(int number) {
	 if (number > AMOUNT_GREATER_THAN) {
	   return number;
	 } else if (number == AMOUNT_GREATER_THAN) {
	   throw new IllegalArgumentException("Value of 0 cannot be processed.");
	 } else {
	   throw new IllegalArgumentException("Negative values cannot be used.");
	 }
	}
/**
 * method process Scanner input that is a String
 * use nextLine() to input names with space
 * apply stringLength check
 * @return stringInput String 
 */
  public static String scanInputString() {
    Scanner sc = new Scanner(System.in);
    String stringInput = stringLength(sc.nextLine());
    return stringInput;
  }
/**
 * method process Scanner input that is a int
 * @return intInput int 
 */
  public static int scanInputInt(){
    Scanner sc = new Scanner(System.in);
    int intInput= 0;
    if (sc.hasNextInt()) {
      intInput = sc.nextInt();
    } else {
      throw new IllegalArgumentException("Value entered must be a integer.");
    }
    return intInput;
  }

	}
