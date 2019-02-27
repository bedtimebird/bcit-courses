/**
 * 
 */
package ca.bcit.comp1451Session05;

/**
 * @author a00749008
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pet p = new Pet("pet1",5);
		Pet c = new Cat("cat1",7,true);
		Pet c2 = new Cat("cat2",15,false);
		Pet c3 = new Cat("cat2",7,false);
		Dog d = new Dog("dog1",5,false);
//		p.makeSound();
//		c.makeSound();
//		d.makeSound();
		
//		System.out.println(p);
//		System.out.println(c);
//		System.out.println(d);
		
		
		System.out.println(" c2.equals(c2) is "+ c2.equals(c3));
		System.out.println(" c2 hashCode is " + c2.hashCode());
		System.out.println(" c3 hashCode is " + c3.hashCode());
		

	}

}
