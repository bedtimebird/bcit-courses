/**
* @author A00964363
*/
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
    ArrayList<Employee> people =  new ArrayList<Employee>();
    people.add(new SalesEmployee("Dante Hicks", 500, 5.15));
    people.add(new SalesEmployee("Randal Graves", 750, 6.75));
    people.add(new HourlyEmployee("Caitlin Bree", 42, 15.95));
    people.add(new HourlyEmployee("Silent Bob", 35, 12.75));
    for (Employee bob : people){
      System.out.println(bob);
    }
	}
}
