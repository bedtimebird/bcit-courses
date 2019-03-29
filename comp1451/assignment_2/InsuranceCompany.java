import java.util.ArrayList;
import java.util.Collections;

public class InsuranceCompany {

  private String companyName;
  private ArrayList<ProjectInvoice> invoices;

  public InsuranceCompany(String companyName){
    setCompanyName(companyName);
    invoices = new ArrayList<ProjectInvoice>();
  }
  public void setCompanyName(String companyName){
    if(companyName == null || companyName.equals("")){
      this.companyName = "unknown";
    } else {
      this.companyName = companyName;
    }
  }
  public String getCompanyName(){
    return companyName;
  }
  public void addInvoice(ProjectInvoice invoice){
    invoices.add(invoice);
  }


  //must throw InvalidInvoiceNumberException
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
    System.out.println("Total insurance fees: $" + Checks.formatMoney(feeTotal));
  }


//must utilize sort by method
public void displayAllInvoices() {
  Collections.sort(invoices);
  System.out.println("Project invoice numbers sorted by total cost: ");
  for(ProjectInvoice invoice:invoices){
    System.out.println(invoice.getInvoiceNumber());
  }
}

}
