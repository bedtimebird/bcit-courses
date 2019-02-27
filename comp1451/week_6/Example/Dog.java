/**
 * 
 */
package ca.bcit.comp1451Session05;

/**
 * @author a00749008
 *
 */
public class Dog extends Pet {
	private boolean isTrained;

	/**
	 * @param name
	 * @param ageInyears
	 */
	public Dog(String name, int ageInyears, boolean trained) {
		super(name, ageInyears);
		isTrained = trained;
	}

	/**
	 * @return the isTrained
	 */
	public boolean isTrained() {
		return isTrained;
	}

	/**
	 * @param isTrained the isTrained to set
	 */
	public void setTrained(boolean isTrained) {
		this.isTrained = isTrained;
	}
	@Override
	public void makeSound( ) {
		System.out.println(" the Dog sound is ");
		super.makeSound();
		System.out.println("Woff");
	}
	
	@Override
	public String toString() {
		return super.toString() + " is trained dog " + isTrained;
	}

}
