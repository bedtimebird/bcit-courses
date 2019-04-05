import java.util.ArrayList;
import java.util.Collections;
/**
 * @author A00964363
 */
public class InsuranceCompany {

  private String companyName;
  private ArrayList<ProjectInvoice> invoices;
/**
 * create InsuranceCompany object
 * @param companyName to set name
 */
  public InsuranceCompany(String companyName){
    setCompanyName(companyName);
    invoices = new ArrayList<ProjectInvoice>();
  }
    /**
 * @param set companyName
 * check String length
 */
  public void setCompanyName(String companyName){
    if(companyName == null || companyName.equals("")){
      this.companyName = "unknown";
    } else {
      this.companyName = companyName;
    }
  }
   /**
 * @return companyName String
 */
  public String getCompanyName(){
    return companyName;
  }
 /**
 * method to addInvoice to arrayList. 
 * @param invoice is ProjectInvoice object
 */
  public void addInvoice(ProjectInvoice invoice){
    invoices.add(invoice);
  }
 /**
 * method to display specific invoice numbers based off
 * @param invoiceNumber String
 * @return toString()
 */
  public void displayInvoice(String invoiceNumber) throws InvalidInvoiceNumberException{
    if(invoiceNumber != null && !invoiceNumber.isEmpty() && invoiceNumber.length() == 9) {
      boolean invoiceFound = false;
      for(ProjectInvoice invoice:invoices){
        if(invoice.getInvoiceNumber().equals(invoiceNumber.toUpperCase())){
          System.out.println(invoice.toString());
          invoiceFound = true;
        } 
      }
      if(invoiceFound == false){
        System.out.println("Invoice number " + invoiceNumber + " not found.");
      }
    } else {
      throw new InvalidInvoiceNumberException("Must enter a 9 character Invoice Number.");
    }
  }
/**
 * method to calculate the total insurance fees for all projects
 */
  public void calcTotalInsuranceFees(){
    double feeTotal = 0;
    for(ProjectInvoice invoice:invoices){
      if(invoice.getClass() == Labour.class) {
        feeTotal = feeTotal + (invoice.calcTotalCost() * 0.05);
        //System.out.println("Labour fee: " + feeTotal);
      } else if (invoice.getClass() == LabourAndMaterial.class) {
        feeTotal = feeTotal + (invoice.calcTotalCost() * 0.07); 
      } else if (invoice.getClass() == LabourAndMaterialAndEquipment.class) {
        feeTotal = feeTotal + (invoice.calcTotalCost() * 0.1); 
      }
    }
    System.out.println("Total insurance fees for all projects: $" + Checks.formatMoney(feeTotal));
  }

/**
 * method to display all invoices
 */
public void displayAllInvoices() {
  Collections.sort(invoices);
  System.out.println("Project invoice numbers sorted by total cost: ");
  for(ProjectInvoice invoice:invoices){
    System.out.println(invoice.getInvoiceNumber());
  }
}
/**
 * method to review all invoice numbers by user input value
 * use of displayInvoice(String invoiceNumber) to display information
 * calls choiceToEnd() at various points to exit loop
 * @throws InvalidInvoiceNumberException, Exception
**/
public void reviewProjects() {
  boolean end = false;
  while (!end) {
    System.out.println("Please enter invoice number:");
    String invoiceNumber = Checks.scanInputString();
    try{
      displayInvoice(invoiceNumber);
      end = choiceToEnd();
    } catch (InvalidInvoiceNumberException i) {
      System.out.println(i.getMessage());
      reviewProjects();
      break;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } 
  }
}

/**
 * method to end loop 
 * called various times through reviewProjects() 
 * @return boolean true = end loop / false = continue
 */
  public boolean choiceToEnd() {
    System.out.println(" ");
    System.out.println("Would you like to perform another action?");
    System.out.println("Yes = 1");
    System.out.println("No = 2");
    boolean end = false;
    switch(Checks.scanInputInt()) {
      case 1: end = false;
              break;
      case 2: System.out.println("Goodbye");
              end = true;
              break;
      default: choiceToEnd();
    }
    return end;
  }  

}
