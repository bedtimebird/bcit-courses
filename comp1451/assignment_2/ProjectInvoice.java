/**
 * @author A00964363
 */
public abstract class ProjectInvoice implements Comparable <ProjectInvoice>{
  
  private String invoiceNumber;
  private String projectName;
  private double hoursWorked;
  private double hourlyRate;
  private static int invoiceSeed = 00001;
  /**
  * @constructor
  */
  public ProjectInvoice(String projectName, double hoursWorked, double hourlyRate){
    setProjectName(projectName);
    setHoursWorked(hoursWorked);
    setHourlyRate(hourlyRate);
    createInvoiceNumber();
  }
  /**
  * apply Checks formatName() & stringLength()
  * @param projectName String
  */     
  public void setProjectName(String projectName){
    this.projectName = Checks.formatName(Checks.stringLength(projectName));
  }
  public String getProjectName(){
    return projectName;
  }
  /**
  * apply Checks doubleValue())
  * @param hoursWorked double
  */     
  public void setHoursWorked(double hoursWorked){
    this.hoursWorked = Checks.doubleValue(hoursWorked);
  }
  /**
  * @return double hoursWorked
  */        
  public double getHoursWorked(){
    return hoursWorked;
  }
  /**
  * apply Checks doubleValue())
  * @param hourlyRate double
  */     
  public void setHourlyRate(double hourlyRate){
    this.hourlyRate = Checks.doubleValue(hourlyRate);
  }
  /**
  * @return double hourlyRate
  */        
  public double getHourlyRate(){
    return hourlyRate;
  }
  /**
  * apply Checks invoiceLength()
  * @param invoiceNumber String
  */     
  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = Checks.invoiceLength(invoiceNumber);
  }  
  /**
  * @return String invoiceNumber
  */        
  public String getInvoiceNumber(){
    return invoiceNumber;
  }
  /**
  * method to create and format invoice numbers
  * set invoiceNumber
  */      
  private void createInvoiceNumber() {
	 invoiceNumber = "INVC" + String.format ("%05d", invoiceSeed);
	 invoiceSeed++;
	 setInvoiceNumber(invoiceNumber);
  }
  /**
  * abstract method calcTotalCost()
  */    
  public abstract double calcTotalCost();
  /**
  * @Override compareTo()
  * compare project invoices based on total cost (calcTotalCost())
  */    
  @Override
  public int compareTo(ProjectInvoice proInv) {
    //compare  the total cost of two ProjectInvoice objects
    return(int)(this.calcTotalCost() - proInv.calcTotalCost());
  }
  /**
  * @Override toString()
  * @return invoice breakdown
  */      
  @Override
  public String toString(){
    String line = "Invoice number: " + getInvoiceNumber() + "\n" + "Project name: " + getProjectName() + "\n" + "Hourly rate: $" + Checks.formatMoney(getHourlyRate()) + "\n" + "Number of working hours: " + getHoursWorked();
    return line;
  }

}
