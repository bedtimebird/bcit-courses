public class LabourAndMaterialAndEquipment extends LabourAndMaterial {

  private static final double RENTAL_RATE = 0.05;
  private static final double TRAINING_RATE = 0.02;
  private double equipValueCAD;
  private double numOfRentedHours;

  public LabourAndMaterialAndEquipment(String projectName, double hoursWorked, double hourlyRate, double transportDistKM, String hourlyRateCriteria, String typeOfLabour, double matPurchPrice, double matVolCubicFT, double matTransportDisKM, double equipValueCAD, double numOfRentedHours) {
    super(projectName, hoursWorked, hourlyRate, transportDistKM, hourlyRateCriteria, typeOfLabour, matPurchPrice, matVolCubicFT, matTransportDisKM);
    setEquipValueCAD(equipValueCAD);
    setNumOfRentedHours(numOfRentedHours);
  }
  public void setEquipValueCAD(double equipValueCAD){
    this.equipValueCAD = Checks.doubleValue(equipValueCAD);
  }
  public double getEquipValueCAD(){
    return equipValueCAD;
  }
  public void setNumOfRentedHours(double numOfRentedHours){
    this.numOfRentedHours = Checks.doubleValue(numOfRentedHours);
  }
  public double getNumOfRentedHours(){
    return numOfRentedHours;
  }
  public double calcTotalRentalFees(){
    double ratePerHour = (getEquipValueCAD() * RENTAL_RATE)*getNumOfRentedHours();
    return ratePerHour;
  }
  public double trainingFees(){
    double tFee = 0;
    if (getTypeOfLabour().equals("inexperienced")){
      tFee = getEquipValueCAD() * TRAINING_RATE;
    } 
    return tFee;
  }
  
  @Override
  public double calcTotalCost(){
    double totalCost = super.calcTotalCost() + (calcTotalRentalFees() + trainingFees()) * SALES_TAX;
    return totalCost;
  }

  @Override
  public String toString(){
    String tCost = "";
    if(this.getClass() == LabourAndMaterialAndEquipment.class){
      tCost = "Total cost including 5% tax: $" + Checks.formatMoney(calcTotalCost());
      }
    String tFee = "";
    if(trainingFees() > 0){
      tFee = "Training fees: $" + Checks.formatMoney(trainingFees()) + "\n";
    }
    return super.toString() + "Equipment number of rented hours: " + getNumOfRentedHours() + "\n" + "Equipment rental fees: $" + Checks.formatMoney(calcTotalRentalFees()) + "\n" + tFee + tCost; 
  }  

}
