public class Boat extends Vehicle{

  private boolean isMotorized;

  public Boat(int yearManufactured, String make, String model, boolean isMotorized){
    super(yearManufactured, make, model);
    setIsMotorized(isMotorized);
  }
  public void setIsMotorized(boolean isMotorized){
    this.isMotorized = isMotorized;
  }
  public boolean getIsMotorized(){
    return isMotorized;
  }

  public void displayDetails(){
    System.out.println("- Boat Details -");
    System.out.println("Year manufactured: " + getYearManufactured());
    System.out.println("Make: " + getMake());
    System.out.println("Model: " + getModel());
    System.out.println("Motor propelled: " + getIsMotorized());
  }  

}
