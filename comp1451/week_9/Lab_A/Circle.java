package ca.bcit.comp1451.Session9LabA;

import java.awt.*;
import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */

public class Circle extends Presentation {
	public int diameter;

	/**
	 * Create a new circle at default position with default color.
	 */
	public Circle() {
		super(230, 90, "blue", true);
		setDiameter(68);
	}

	public void setDiameter(int diameter) {
		this.diameter = Checks.minInt(diameter);
	}

	public int getDiameter() {
		return diameter;
	}

	/**
	 * Change the size to the new size (in pixels). Size must be >= 0.
	 */

	public void changeSize(int newDiameter) {
		erase();
		diameter = newDiameter;
		draw();
	}

	/**
	 * Draw the circle with current specifications on screen.
	 */
	@Override
	public void draw() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, diameter, diameter));
			canvas.wait(10);
		}
	}

}
