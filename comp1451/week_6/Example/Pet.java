/**
 * 
 */
package ca.bcit.comp1451Session05;

/**
 * @author a00749008
 *
 */
public class Pet {
  private String name;
  private int ageInyears;
/**
 * @param name
 * @param ageInyears
 */
public Pet(String name, int ageInyears) {
	this.name = name;
	this.ageInyears = ageInyears;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the ageInyears
 */
public int getAgeInyears() {
	return ageInyears;
}
/**
 * @param ageInyears the ageInyears to set
 */
public void setAgeInyears(int ageInyears) {
	this.ageInyears = ageInyears;
}

public void getMyType(){
	System.out.println("Pet");
}

public  void makeSound() {
	System.out.println(" the pet is making a sound");
}

 @Override
 public String toString() {
	 return  this.getClass().getSimpleName() +" name is "+ name + " pet age is " + ageInyears +" years old";
 }
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof Pet))
		return false;
	Pet other = (Pet) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}


 

}
