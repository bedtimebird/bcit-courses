class Main {
  public static void main(String[] args) {
    InsuranceCompany ing = new InsuranceCompany("ING");
    ing.addInvoice(new Labour("Large Hadron Collider", 5000.0, 125.0, 1500.00, "regular", "experienced"));
    ing.addInvoice(new Labour("Mars’ Opportunity and Curiosity rovers", 2500.0, 20.0, 15000.00, "regular", "experienced"));
    ing.addInvoice(new LabourAndMaterial("Three Gorges Dam", 10000.0, 10.0, 200.00, "overtime", "inexperienced", 5.0, 210000.0, 35.0));
    ing.addInvoice(new LabourAndMaterial("Burj Khalifa", 2000.0, 25.0, 50.00, "holiday", "inexperienced", 1000.0, 500.0, 50.0));
    ing.addInvoice(new LabourAndMaterialAndEquipment("Brenner Base Tunnel", 1500.0, 100.0, 50.00, "regular", "experienced", 200.0, 50000.0, 50.0, 500000, 200));
    ing.addInvoice(new LabourAndMaterialAndEquipment("Millau Viaduct", 1200.0, 300.0, 10.00, "regular", "experienced", 2000.0, 4000.0, 15.0, 5000, 120));
    ing.displayAllInvoices();
    ing.calcTotalInsuranceFees();
    
/**
    try {
      ing.displayInvoice("INVC00001");
    } catch(InvalidInvoiceNumberException e){
      System.out.println(e.getMessage());
    }
    ing.displayAllInvoices();
**/
  } 
}
