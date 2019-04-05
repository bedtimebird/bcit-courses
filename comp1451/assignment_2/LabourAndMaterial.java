/**
 * @author A00964363
 */

public class LabourAndMaterial extends Labour implements Transferable{

  private static final double MARK_UP = 1.15;
  private static final double SMALL_VOL_FEE = 1.5;
  private static final double LARGE_VOL_FEE = 2;
  private double matPurchPrice; //material purchase price
  private double matVolCubicFT; //material volume in cubic feet
  private double matTransportDisKM; //transportation distance for material in KM
  /**
  * @constructor
  */
  public LabourAndMaterial(String projectName, double hoursWorked, double hourlyRate, double transportDistKM, String hourlyRateCriteria, String typeOfLabour, double matPurchPrice, double matVolCubicFT, double matTransportDisKM){
    super(projectName, hoursWorked, hourlyRate, transportDistKM, hourlyRateCriteria, typeOfLabour);
    setMatPurchPrice(matPurchPrice);
    setMatVolCubicFT(matVolCubicFT);
    setMatTransportDisKM(matTransportDisKM);
  }
  /**
  * apply Checks doubleValue())
  * @param matPurchPrice double
  */  
  public void setMatPurchPrice(double matPurchPrice){
    this.matPurchPrice = Checks.doubleValue(matPurchPrice);
  }
  /**
  * @return double matPurchPrice
  */    
  public double getMatPurchPrice(){
    return matPurchPrice;
  }
  /**
  * apply Checks doubleValue())
  * @param matVolCubicFT double
  */    
  public void setMatVolCubicFT(double matVolCubicFT){
    this.matVolCubicFT = Checks.doubleValue(matVolCubicFT);
  }
  /**
  * @return double matVolCubicFT
  */      
  public double getMatVolCubicFT(){
    return matVolCubicFT;
  }
  /**
  * apply Checks doubleValue())
  * @param matTransportDisKM double
  */      
  public void setMatTransportDisKM(double matTransportDisKM){
    this.matTransportDisKM = Checks.doubleValue(matTransportDisKM);
  }
  /**
  * @return double matTransportDisKM
  */     
  public double getMatTransportDisKM(){
    return matTransportDisKM;
  }
  /**
  * method to calculate value of material Cost
  * @return materialTotalCost double
  */  
  public double materialTotalCost(){
    double materialTotalCost = getMatPurchPrice() * MARK_UP;
    return materialTotalCost;
  }
  /**
  * @Override method to calculate transportation cost
  * apply if statement to calculate value based on distance and volume
  * @return materialTransportCost double
  */
  @Override
  public double calcTransportationCost(){
    double materialTransportCost = 0;
    if (getMatVolCubicFT() >= 10) {
      materialTransportCost = getMatTransportDisKM() * LARGE_VOL_FEE;
    } else {
      materialTransportCost = getMatTransportDisKM() * SMALL_VOL_FEE;
    }
    return materialTransportCost;
  }
  /**
  * @Override method to calculate total cost
  * @return totalCost double
  */
  @Override
  public double calcTotalCost(){
    double totalCost = super.calcTotalCost() + (calcTransportationCost() + materialTotalCost()) * SALES_TAX;
    return totalCost;
  }  
  /**
  * @Override toString()
  * @return invoice breakdown
  */    
  @Override
  public String toString(){
    String line = "";
    if(this.getClass() == LabourAndMaterial.class){
      line = "Total cost including 5% tax: $" + Checks.formatMoney(calcTotalCost());
      }
    return super.toString() +  "Material cost is: $" + Checks.formatMoney(getMatPurchPrice()) + "\n" +  "The material transportation fee is: $" + Checks.formatMoney(calcTransportationCost()) + "\n" + line ; 
  }  
 
}
