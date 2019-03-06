/**
* @author A00964363
*/
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
    Electronics[] elecArray = new Electronics[3];
    elecArray[0] = new Cellphone("Nokia TS200", 300, 18, 3.5);
    elecArray[1] = new Computer("Dell D2100", 1000, 24, 2500, 512);
    elecArray[2] = new Laptop("HP N5170", 1500, 24, 1500, 256, 15);
    System.out.println(" ");
    System.out.println(Arrays.toString(elecArray));
    elecArray[0].increasePrice(0.05);
    elecArray[1].increasePrice(0.05);
    elecArray[2].increasePrice(0.05);
    System.out.println(" ");
    System.out.println(Arrays.toString(elecArray));
	}
}
