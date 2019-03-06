public class HourlyEmployee extends Employee {

  private int numberOfHours;
  private double payRate;

  public HourlyEmployee(String name, int numberOfHours, double payRate){
    super(name);
    setNumberOfHours(numberOfHours);
    setPayRate(payRate);
  }
  public void setNumberOfHours(int numberOfHours){
    this.numberOfHours = Checks.minInt(numberOfHours);
  }
  public int getNumberOfHours(){
    return numberOfHours;
  }
  public void setPayRate(double payRate){
    this.payRate = Checks.minDouble(payRate);
  }
  public double getPayRate(){
    return payRate;
  }
	@Override
	public double calculatePay() {
    double Pay = payRate * numberOfHours;
    return Pay;
  }
	@Override
	public String toString() {
		String line = super.toString() + "\n" + "Hourly Employee" + "\n" +  "Hourly rate: $" + Checks.formatMoney(getPayRate()) + "\n" + "Number of hours: " + getNumberOfHours() + "\n" + "Pay: $" + Checks.formatMoney(calculatePay());
		return line;
	}        
}
