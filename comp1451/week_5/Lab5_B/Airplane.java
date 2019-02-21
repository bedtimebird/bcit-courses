public class Airplane extends Vehicle{

  private int maxHeight; //maximum height in feet

  public Airplane(int yearManufactured, String make, String model, int maxHeight){
    super(yearManufactured, make, model);
    setMaxHeight(maxHeight);
  }
  public void setMaxHeight(int maxHeight){
    this.maxHeight = Checks.numberLength(maxHeight);
  }
  public int getMaxHeight(){
    return maxHeight;
  }
  public void displayDetails(){
    System.out.println("- Airplane Details -");
    System.out.println("Year manufactured: " + getYearManufactured());
    System.out.println("Make: " + getMake());
    System.out.println("Model: " + getModel());
    System.out.println("Maximum altitude: " + getMaxHeight() + " ft.");
  }    


}
