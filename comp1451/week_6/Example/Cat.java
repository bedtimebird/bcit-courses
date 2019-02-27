/**
 * 
 */
package ca.bcit.comp1451Session05;

/**
 * @author a00749008
 *
 */
public class Cat extends Pet {
	private boolean isInDoor;

	/**
	 * @param name
	 * @param ageInyears
	 */
	public Cat(String name, int ageInyears, boolean indoor) {
		super(name, ageInyears);
		isInDoor = indoor;
	}

	/**
	 * @return the isInDoor
	 */
	public boolean isInDoor() {
		return isInDoor;
	}

	/**
	 * @param isInDoor the isInDoor to set
	 */
	public void setInDoor(boolean isInDoor) {
		this.isInDoor = isInDoor;
	}

	 public void makeSound() {
		 System.out.println("Meow");
	 }

	@Override
	public String toString() {
		return super.toString() + " is in door cat " + isInDoor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (isInDoor ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Cat))
			return false;
		Cat other = (Cat) obj;
		if (isInDoor != other.isInDoor)
			return false;
		return true;
	}

	
	 
	 
	
	}
	

