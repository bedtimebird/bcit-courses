package ca.bcit.comp1451.Session9LabA;

/**
 * This class represents a simple picture. You can draw the picture using the
 * draw method. But wait, there's more: being an electronic picture, it can be
 * changed. You can set it to black-and-white display and back to colors (only
 * after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture {
	private Square wall;
	private Square window;
	private Triangle roof;
	private Circle sun;

	/**
	 * Constructor for objects of class Picture
	 */
	public Picture() {
		// nothing to do... instance variables are automatically set to null
	}

	/**
	 * Draw this picture.
	 */
	public void draw() {
		wall = new Square();
		wall.erase();
		wall.xPosition += -140;
		wall.draw();

		wall.erase();
		wall.yPosition += 20;
		wall.draw();

		wall.erase();
		wall.size = 120;
		wall.draw();

		wall.isVisible = true;
		wall.draw();

		window = new Square();

		window.color = "black";

		window.erase();
		window.xPosition += -120;
		window.draw();

		window.erase();
		window.yPosition += 40;
		window.draw();

		window.erase();
		window.size = 40;

		window.isVisible = true;
		window.draw();

		roof = new Triangle();

		roof.erase();
		roof.height = 60;
		roof.width = 180;

		roof.erase();
		roof.xPosition += 20;
		roof.draw();

		roof.erase();
		roof.yPosition += -60;
		roof.draw();

		roof.isVisible = true;
		roof.draw();

		sun = new Circle();

		sun.color = "yellow";

		sun.erase();
		sun.xPosition += 100;
		sun.draw();

		sun.erase();
		sun.yPosition += -40;
		sun.draw();

		sun.erase();
		sun.diameter = 80;
		sun.draw();

		sun.isVisible = true;
		sun.draw();
	}

	/**
	 * Change this picture to black/white display
	 */
	public void setBlackAndWhite() {
		if (wall != null) // only if it's painted already...
		{
			wall.changeColor("black");
			window.changeColor("white");
			roof.changeColor("black");
			sun.changeColor("black");
		}
	}

	/**
	 * Change this picture to use color display
	 */
	public void setColor() {
		if (wall != null) // only if it's painted already...
		{
			wall.changeColor("red");
			window.changeColor("black");
			roof.changeColor("green");
			sun.changeColor("yellow");
		}
	}
}
