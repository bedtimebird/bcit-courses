/**
 * Project: examples8
 * File: NamedColors.java
 * Date: Mar 2, 2015
 * Time: 6:33:14 PM
 */

package bounce;

import java.awt.Color;

/**
 * @author Sam Cirka, A00123456
 *
 */
public enum NamedColor {

	Black("Black", Color.BLACK), //
	Blue("Blue", Color.BLUE), //
	Cyan("Cyan", Color.CYAN), //
	DarkGray("DarkGray", Color.DARK_GRAY), //
	Gray("Gray", Color.GRAY), //
	Green("Green", Color.GREEN), //
	LightGray("LightGray", Color.LIGHT_GRAY), //
	Magenta("Magenta", Color.MAGENTA), //
	Orange("Orange", Color.ORANGE), //
	Pink("Pink", Color.PINK), //
	Red("Red", Color.RED), //
	White("White", Color.WHITE), //
	Yellow("Yellow", Color.YELLOW); //
	
	private String name;
	private Color color;
	
	NamedColor(String name, Color color) {
		this.name = name;
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * @return the color
	 */
	public static NamedColor getNamedColor(int ordinal) {
		switch (ordinal) {
		case 0:
			return Black;
		case 1:
			return Blue;
		case 2:
			return Cyan;
		case 3:
			return DarkGray;
		case 4:
			return Gray;
		case 5:
			return Green;
		case 6:
			return LightGray;
		case 7:
			return Magenta;
		case 8:
			return Orange;
		case 9:
			return Pink;
		case 10:
			return Red;
		case 11:
			return White;
		case 12:
			return Yellow;
		}
		
		return null;
	}
	
}
