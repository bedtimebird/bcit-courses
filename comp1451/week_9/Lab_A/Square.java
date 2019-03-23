package ca.bcit.comp1451.Session9LabA;

import java.awt.*;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */

public class Square extends Presentation {
	public int size;

	/**
	 * Create a new square at default position with default color.
	 */
	public Square() {
		super(310, 120, "red", false);
		size = 60;
	}

	/**
	 * Change the size to the new size (in pixels). Size must be >= 0.
	 */

	public void changeSize(int newSize) {
		erase();
		size = newSize;
		draw();
	}

	/**
	 * Draw the square with current specifications on screen.
	 */
	@Override
	public void draw() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.draw(this, color, new Rectangle(xPosition, yPosition, size, size));
			canvas.wait(10);
		}
	}

}
