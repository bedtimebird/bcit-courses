public class SalesEmployee extends Employee {

  private int numberOfSoldUnits;
  private double commissionRatePerUnit;

  public SalesEmployee(String name, int numberOfSoldUnits, double commissionRatePerUnit){
    super(name);
    setNumberOfSoldUnits(numberOfSoldUnits);
    setCommissionRatePerUnit(commissionRatePerUnit);
  }
  public void setNumberOfSoldUnits(int numberOfSoldUnits){
    this.numberOfSoldUnits = Checks.minInt(numberOfSoldUnits);
  }
  public int getNumberOfSoldUnits(){
    return numberOfSoldUnits;
  }
  public void setCommissionRatePerUnit(double commissionRatePerUnit) {
    this.commissionRatePerUnit = Checks.minDouble(commissionRatePerUnit);
  }
  public double getCommissionRatePerUnit(){
    return commissionRatePerUnit;
  }
	@Override
	public double calculatePay() {
    double Pay = numberOfSoldUnits * commissionRatePerUnit;
    return Pay;
  }
	@Override
	public String toString() {
		String line = super.toString() + "\n" + "Sales Employee" + "\n" +  "Units sold: " + getNumberOfSoldUnits() + "\n" + "Commission rate: $" + Checks.formatMoney(getCommissionRatePerUnit()) + "\n" + "Pay: $" + Checks.formatMoney(calculatePay());
		return line;
	}        
}
