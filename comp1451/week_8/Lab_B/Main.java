/**
* @author A00964363
*/
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
    ArrayList<AudioMaterial> audio =  new ArrayList<AudioMaterial>();
    audio.add(new Album("Illmatic", 39.51, 8, "Nas"));
    audio.add(new AudioBook("Ender's Game", 717, 324, "	Orson Scott Card"));
    audio.add(new Movie("Reservoir Dogs", 99, "Quentin Tarantino", 6));
    System.out.println("---Unsorted List---");
    for (AudioMaterial a : audio){
      System.out.println(a);
    }
    System.out.println("---Sorted List---");
    Collections.sort(audio);
    for (AudioMaterial a : audio){
      System.out.println(a);
    }
	}
}
