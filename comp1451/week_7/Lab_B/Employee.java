public abstract class Employee {

  private String name;

  public Employee(String name) {
    setName(name);
  }
  public void setName(String name){
    this.name = Checks.formatString(Checks.lengthString(name));
  }
  public String getName(){
    return name;
  } 
   
  public abstract double calculatePay();

	@Override
	public String toString() {
		String line = "\n" + "Name: " + getName();
		return line;
	}    
}
