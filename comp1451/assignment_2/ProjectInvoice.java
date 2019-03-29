public abstract class ProjectInvoice implements Comparable <ProjectInvoice>{
  
  private String invoiceNumber;
  private String projectName;
  private double hoursWorked;
  private double hourlyRate;
  private static int invoiceSeed = 00001;

  public ProjectInvoice(String projectName, double hoursWorked, double hourlyRate){
    setProjectName(projectName);
    setHoursWorked(hoursWorked);
    setHourlyRate(hourlyRate);
    createInvoiceNumber();
  }
  public void setProjectName(String projectName){
    this.projectName = Checks.formatName(Checks.stringLength(projectName));
  }
  public String getProjectName(){
    return projectName;
  }
  public void setHoursWorked(double hoursWorked){
    this.hoursWorked = Checks.doubleValue(hoursWorked);
  }
  public double getHoursWorked(){
    return hoursWorked;
  }
  public void setHourlyRate(double hourlyRate){
    this.hourlyRate = Checks.doubleValue(hourlyRate);
  }
  public double getHourlyRate(){
    return hourlyRate;
  }
  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = Checks.invoiceLength(invoiceNumber);
  }  
  public String getInvoiceNumber(){
    return invoiceNumber;
  }
  private void createInvoiceNumber() {
	 invoiceNumber = "INVC" + String.format ("%05d", invoiceSeed);
	 invoiceSeed++;
	 setInvoiceNumber(invoiceNumber);
  }

  public abstract double calcTotalCost();

  @Override
  public int compareTo(ProjectInvoice proInv) {
    //compare  the total cost of two ProjectInvoice objects
    return(int)(this.calcTotalCost() - proInv.calcTotalCost());
  }
  
  @Override
  public String toString(){
    String line = "Invoice number: " + getInvoiceNumber() + "\n" + "Project name: " + getProjectName() + "\n" + "Hourly rate: $" + Checks.formatMoney(getHourlyRate()) + "\n" + "Number of working hours: " + getHoursWorked();
    return line;
  }
/*
--do not think below methods are required, delete?--

  public void displayInvoiceInformation(){
    System.out.println("Display invoice information: ");
    System.out.println("Project name: " + getProjectName());
    System.out.println("Hours worked: " + getHoursWorked());
    System.out.println("Hourly rate: "+ getHourlyRate());
    System.out.println("Invoice number: " + getInvoiceNumber());
  }

*/

}
