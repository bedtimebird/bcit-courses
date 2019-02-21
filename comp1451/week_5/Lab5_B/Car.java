public class Car extends Vehicle{
  
  private int horsePower;

  public Car(int yearManufactured, String make, String model, int horsePower){
    super(yearManufactured, make, model);
    setHorsePower(horsePower);
  }
  public void setHorsePower(int horsePower){
    this.horsePower = Checks.numberLength(horsePower);
  }
  public int getHorsePower(){
    return horsePower;
  }

  public void displayDetails(){
    System.out.println("- Car Details -");
    System.out.println("Year manufactured: " + getYearManufactured());
    System.out.println("Make: " + getMake());
    System.out.println("Model: " + getModel());
    System.out.println("Horsepower: " + getHorsePower() + " hp");
  }

}
