public class Vehicle {
  private int yearManufactured;
  private String make;
  private String model;

  public Vehicle(int yearManufactured, String make, String model){
    setYearManufactured(yearManufactured);
    setMake(make);
    setModel(model);
  }
  public void setYearManufactured(int yearManufactured){
    this.yearManufactured = Checks.numberLength(yearManufactured);
  }
  public int getYearManufactured(){
    return yearManufactured;
  }
  public void setMake(String make){
    this.make = Checks.formatString(Checks.stringLength(make));
  }
  public String getMake(){
    return make;
  }
  public void setModel(String model){
    this.model = Checks.formatString(Checks.stringLength(model));;
  }
  public String getModel(){
    return model;
  }


}
