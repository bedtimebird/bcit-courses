package ca.bcit.comp1451.Session9LabA;

public abstract class Presentation implements Drawable {

	public int xPosition;
	public int yPosition;
	public String color;
	public boolean isVisible;
	private final int DISTANCE_RIGHT = 20;
	private final int DISTANCE_LEFT = -20;
	private final int DISTANCE_UP = -20;
	private final int DISTANCE_DOWN = 20;

	public Presentation(int xPosition, int yPosition, String color, boolean isVisible) {
		setXPosition(xPosition);
		setYPosition(yPosition);
		setColor(color);
		setIsVisible(isVisible);
	}

	public void setXPosition(int xPosition) {
		this.xPosition = Checks.minInt(xPosition);
	}

	public int getXPosition() {
		return xPosition;
	}

	public void setYPosition(int yPosition) {
		this.yPosition = Checks.minInt(yPosition);
	}

	public int getYPosition() {
		return yPosition;
	}

	public void setColor(String color) {
		this.color = Checks.colorInput(Checks.lengthString(color));
	}

	public String getColor() {
		return color;
	}

	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public boolean getIsVisible() {
		return isVisible;
	}

	/**
	 * Make this circle visible. If it was already visible, do nothing.
	 */
	public void makeVisible() {
		isVisible = true;
		draw();
	}

	/**
	 * Make this circle invisible. If it was already invisible, do nothing.
	 */
	public void makeInvisible() {
		erase();
		isVisible = false;
	}

	/**
	 * Move the circle a few pixels to the right.
	 */
	public void moveRight() {
		moveHorizontal(DISTANCE_RIGHT);
	}

	/**
	 * Move the circle a few pixels to the left.
	 */
	public void moveLeft() {
		moveHorizontal(DISTANCE_LEFT);
	}

	/**
	 * Move the circle a few pixels up.
	 */
	public void moveUp() {
		moveVertical(DISTANCE_UP);
	}

	/**
	 * Move the circle a few pixels down.
	 */
	public void moveDown() {
		moveVertical(DISTANCE_DOWN);
	}

	/**
	 * Move the circle horizontally by 'distance' pixels.
	 */
	public void moveHorizontal(int distance) {
		erase();
		xPosition += distance;
		draw();
	}

	/**
	 * Move the circle vertically by 'distance' pixels.
	 */
	public void moveVertical(int distance) {
		erase();
		yPosition += distance;
		draw();
	}

	/**
	 * Slowly move the circle horizontally by 'distance' pixels.
	 */
	public void slowMoveHorizontal(int distance) {
		int delta;

		if (distance < 0) {
			delta = -1;
			distance = -distance;
		} else {
			delta = 1;
		}

		for (int i = 0; i < distance; i++) {
			xPosition += delta;
			draw();
		}
	}

	/**
	 * Slowly move the circle vertically by 'distance' pixels.
	 */
	public void slowMoveVertical(int distance) {
		int delta;

		if (distance < 0) {
			delta = -1;
			distance = -distance;
		} else {
			delta = 1;
		}

		for (int i = 0; i < distance; i++) {
			yPosition += delta;
			draw();
		}
	}

	/**
	 * Change the color. Valid colors are "red", "yellow", "blue", "green",
	 * "magenta" and "black".
	 */
	public void changeColor(String newColor) {
		color = newColor;
		draw();
	}

	/**
	 * Erase the triangle on screen.
	 */
	public void erase() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.erase(this);
		}
	}

}
