import java.util.HashMap;
import java.util.Scanner;
/**
 * @author A00964363
 */
public class Date {
  public static final int MIN_DAY = 1;
  public static final int MAX_DAY = 31;
  public static final int MIN_MON = 1;
  public static final int MAX_MON = 12;
  public static final int MIN_YEAR = 1900;
  public static final int MAX_YEAR = 2019;
	
  private int day;
  private int month;
  private int year;
  private HashMap<Integer, String> numMonth;
/**
 * @constructor
 */
 public Date(int day, int month, int year) {
   setDay(day);
   setMonth(month);
   setYear(year);
   intializeNumMonth();
 }
   /**
  * apply checkDateInput
  * @param day int
  */
 public void setDay(int day) {
   this.day = checkDateInput(day, MIN_DAY, MAX_DAY);
 }
   /**
  * @return day int
  */
 public int getDay() {
   return day;
 }
  /**
  * apply checkDateInput
  * @param month int
  */
 public void setMonth(int month) {
   this.month = checkDateInput(month, MIN_MON, MAX_MON);
 }
    /**
  * @return month int
  */
 public int getMonth() {
   return month;
 }
   /**
  * apply checkDateInput
  * @param year int
  */
 public void setYear(int year) {
   this.year = checkDateInput(year, MIN_YEAR, MAX_YEAR);
 }
     /**
  * @return year int
  */
 public int getYear() {
   return year;
 }
  /**
  * method to check date input
  * can be used to check day, month, year 
  * condition based of max int allowable
  * @param input int - value to be tested
  * @param min int - minimum value allowed
  * @param max int - maximum value allowed
  */
 public static int checkDateInput(int input, int min, int max) {
   int value = 0;
   if(input >= min && input <= max) {
     value = input;
   } else if (max == MAX_DAY) {
     value = 1;
   } else if (max == MAX_MON) {
     value = 1;
   } else if (max == MAX_YEAR) {
     value = 1900;
   } else {
     throw new IllegalArgumentException("Illegal value entered.");
   }
   return value;
 }
  /**
  * method to initial month hashMap name based on number
  */
 public void intializeNumMonth() {
   numMonth = new HashMap<Integer, String>();
   numMonth.put(1, "January");
   numMonth.put(2, "Febraury");
   numMonth.put(3, "March");
   numMonth.put(4, "April");
   numMonth.put(5, "May");
   numMonth.put(6, "June");
   numMonth.put(7, "July");
   numMonth.put(8, "August");
   numMonth.put(9, "September");
   numMonth.put(10, "October");
   numMonth.put(11, "November");
   numMonth.put(12, "December");
 }
   /**
  * method format date displayed using hashMap
  * @return stringMonth String
  */
 public String stringMonth() {
   String stringMonth = (String.format("%02d", day) + "/" + numMonth.get(month) + "/" + year);
   return stringMonth;
 }
   /**
  * method to input date information by asking for day, month, year
  * @return newDate Date
  */
  public static Date requestDate() {
    System.out.println("What day did the transaction occur on?");
    System.out.println(" (enter value between " + MIN_DAY + " and " + MAX_DAY + ").");
    int day = checkDateInput(Checks.scanInputInt(), MIN_DAY, MAX_DAY);
    System.out.println("What month did the transaction occur on?");
    System.out.println(" (enter value between " + MIN_MON + " and " + MAX_MON + ").");
    int mon = checkDateInput(Checks.scanInputInt(), MIN_MON, MAX_MON);
    System.out.println("What year did the transaction occur on?");
    System.out.println(" (enter value between " + MIN_YEAR + " and " + MAX_YEAR + ").");
    int year = checkDateInput(Checks.scanInputInt(), MIN_YEAR, MAX_YEAR);
    Date newDate = new Date(day, mon, year);
    return newDate;
  }

}
