/**
 * Project: a00964363
 * File: Lab1.java
 * Date: Apr 17, 2019
 * Time: 11:44:28 AM
 */
package lab1;

import lab1.data.AudioFile;
import lab1.data.music.CompactDisc;
import lab1.data.music.VinylRecordAlbum;

/**
 * @author Mike Bird, A00964363
 *
 */
public class Lab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lab1 lab1 = new Lab1();
		lab1.test();

	}

	public void test() {
		VinylRecordAlbum spinMe1 = new VinylRecordAlbum("The Spinners", "Spin Me", 12, 120);
		System.out.println(spinMe1.toString());
		spinMe1.setWeight(110);
		System.out.println(spinMe1.toString());
		spinMe1.setWeight(180);
		System.out.println(spinMe1.toString());
		spinMe1.play();
		CompactDisc turnaboutIntruder1 = new CompactDisc("Jim Kirk", "Turnabout Intuder", 9);
		System.out.println(turnaboutIntruder1.toString());
		turnaboutIntruder1.play();
		AudioFile buzzClick1 = new AudioFile("Cyber Punks", "Buzz-Click", "Wish I Bought Vinyl.m4a", 3.46);
		System.out.println(buzzClick1.toString());
		buzzClick1.save("Wish I Bought Vinyl.m4a", "C:/My Music/itunes");
		buzzClick1.play();
		buzzClick1.delete("Wish I Bought Vinyl.m4a", "C:/My Music/itunes");
	}

}
