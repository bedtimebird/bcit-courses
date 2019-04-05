/**
 * @author A00964363
 */
public class Labour extends ProjectInvoice{
  private static double TRANSPORT_COST_MULTIPLE = 1.2;
  private static double OVERTIME_BONUS = 1.5;
  private static double HOLIDAY_BONUS = 2.0;
  public static double SALES_TAX = 1.05;

  private double distanceOfTransportationInKilometers; 
  private String hourlyRateCriteria;
  private String typeOfLabour;
  /**
  * @constructor
  */
  public Labour(String projectName, double hoursWorked, double hourlyRate, double distanceOfTransportationInKilometers, String hourlyRateCriteria, String typeOfLabour){
    super(projectName, hoursWorked, hourlyRate);
    setDistanceOfTransportationInKilometers(distanceOfTransportationInKilometers);
    setHourlyRateCriteria(hourlyRateCriteria);
    setTypeOfLabour(typeOfLabour);
  }
  /**
  * apply Checks doubleValue())
  * @param distanceOfTransportationInKilometers double
  */  
  public void setDistanceOfTransportationInKilometers(double distanceOfTransportationInKilometers){
    this.distanceOfTransportationInKilometers = Checks.doubleValue(distanceOfTransportationInKilometers);
  }
  /**
  * @return double distanceOfTransportationInKilometers
  */  
  public double getDistanceOfTransportationInKilometers(){
    return distanceOfTransportationInKilometers;
  }
  /**
  * apply toLowerCase() to String
  * @param hourlyRateCriteria String 
  * can only equal valies "regular",  "overtime" and "holiday"
  * default value is "regular"
  */    
  public void setHourlyRateCriteria(String hourlyRateCriteria){
    String criteria = hourlyRateCriteria.toLowerCase();
    if(criteria.equals("regular") || criteria.equals("overtime") || criteria.equals("holiday")) {
      this.hourlyRateCriteria = criteria;
    } else {
      this.hourlyRateCriteria = "regular";
    }
  }
  /**
  * @return String hourlyRateCriteria
  */    
  public String getHourlyRateCriteria(){
    return hourlyRateCriteria;
  }
  /**
  * apply toLowerCase() to String
  * @param typeOfLabour String 
  * can only equal valies "experienced" and "inexperienced"
  * default value is "inexperienced"
  */      
  public void setTypeOfLabour(String typeOfLabour){
    String type = typeOfLabour.toLowerCase();
    if(type.equals("experienced") || type.equals("inexperienced")){
      this.typeOfLabour = type;
    } else {
      this.typeOfLabour = "inexperienced";
    }
  }
  /**
  * @return String typeOfLabour
  */      
  public String getTypeOfLabour(){
    return typeOfLabour;
  }
  /**
  * method to calculate value of Transportation Cost
  * @return transportCost double
  */
  public double calcTransportationCost(){
    double transportCost = (TRANSPORT_COST_MULTIPLE * distanceOfTransportationInKilometers);
    //double labourTransportCost = 100;
    return transportCost;
  }
  /**
  * @Override method to calculate total cost
  * apply if statement to calculate value based on typeOfLabour
  * @return totalCost double
  */
  @Override
  public double calcTotalCost(){
    double totalCost = 0;
    if(hourlyRateCriteria.equals("regular")){
      totalCost = getHourlyRate() * getHoursWorked();
    } else if (hourlyRateCriteria.equals("overtime")) {
      totalCost = getHourlyRate() * getHoursWorked() * OVERTIME_BONUS;
    } else if (hourlyRateCriteria.equals("holiday")) {
      totalCost = getHourlyRate() * getHoursWorked() * HOLIDAY_BONUS;
    }
    totalCost = (totalCost + calcTransportationCost())* SALES_TAX;
    return totalCost;
  }
  /**
  * @Override toString()
  * @return invoice breakdown
  */  
  @Override
  public String toString(){
    String line = "";
    if(this.getClass() == Labour.class){
      line = "Total cost including 5% tax: $" + Checks.formatMoney(calcTotalCost());
      }
    return super.toString() + "\n" +  "Hourly rate criteria: " + getHourlyRateCriteria() + "\n" + "Type of labour: " + getTypeOfLabour() + "\n" + "Cost of labour transportation: $" + calcTransportationCost() + "\n" + line ;
  }

}
