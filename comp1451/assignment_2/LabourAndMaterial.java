public class LabourAndMaterial extends Labour implements Transferable{

  private static final double MARK_UP = 1.15;
  private static final double SMALL_VOL_FEE = 1.5;
  private static final double LARGE_VOL_FEE = 2;
  private double matPurchPrice; //material purchase price
  private double matVolCubicFT; //material volume in cubic feet
  private double matTransportDisKM; //transportation distance for material in KM

  public LabourAndMaterial(String projectName, double hoursWorked, double hourlyRate, double transportDistKM, String hourlyRateCriteria, String typeOfLabour, double matPurchPrice, double matVolCubicFT, double matTransportDisKM){
    super(projectName, hoursWorked, hourlyRate, transportDistKM, hourlyRateCriteria, typeOfLabour);
    setMatPurchPrice(matPurchPrice);
    setMatVolCubicFT(matVolCubicFT);
    setMatTransportDisKM(matTransportDisKM);
  }
  public void setMatPurchPrice(double matPurchPrice){
    this.matPurchPrice = Checks.doubleValue(matPurchPrice);
  }
  public double getMatPurchPrice(){
    return matPurchPrice;
  }
  public void setMatVolCubicFT(double matVolCubicFT){
    this.matVolCubicFT = Checks.doubleValue(matVolCubicFT);
  }
  public double getMatVolCubicFT(){
    return matVolCubicFT;
  }
  public void setMatTransportDisKM(double matTransportDisKM){
    this.matTransportDisKM = Checks.doubleValue(matTransportDisKM);
  }
  public double getMatTransportDisKM(){
    return matTransportDisKM;
  }
  public double matTotalCost(){
    double matTotalCost = getMatPurchPrice() * MARK_UP;
    return matTotalCost;
  }

  @Override
  public double calcTransportCost(){
    double materialTransportCost = 0;
    if (getMatVolCubicFT() >= 10) {
      materialTransportCost = getMatTransportDisKM() * LARGE_VOL_FEE;
    } else {
      materialTransportCost = getMatTransportDisKM() * SMALL_VOL_FEE;
    }
    return materialTransportCost;
  }

  @Override
  public double calcTotalCost(){
    double totalCost = super.calcTotalCost() + (calcTransportCost() + matTotalCost()) * SALES_TAX;
    return totalCost;
  }  
  
  @Override
  public String toString(){
    String line = "";
    if(this.getClass() == LabourAndMaterial.class){
      line = "Total cost including 5% tax: $" + Checks.formatMoney(calcTotalCost());
      }
    return super.toString() +  "Material cost is: $" + Checks.formatMoney(getMatPurchPrice()) + "\n" +  "The material transportation fee is: $" + Checks.formatMoney(calcTransportCost()) + "\n" + line; 
  }  
 
}
