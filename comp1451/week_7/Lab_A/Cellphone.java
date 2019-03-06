public class Cellphone extends Electronics {

  private static final int WARRANTY_INCREASE = 6;

  private double batteryLifeTime;

  public Cellphone(String brand, double price, int warranty, double batteryLifeTime){
    super(brand, price, warranty);
    setBatteryLifeTime(batteryLifeTime);
  }

  public void setBatteryLifeTime(double batteryLifeTime){
    this.batteryLifeTime = Checks.minDouble(batteryLifeTime);
  }
  public double getBatteryLifeTime(){
    return batteryLifeTime;
  }

	@Override
	public String toString() {
		String line = super.toString() + "\n" + "Batter life: " + getBatteryLifeTime();
		return line;
	}    

  @Override
  public void increasePrice(double percentage){
    setPrice((getPrice()*(Checks.minDouble(percentage) + 1)));
    setWarranty((getWarranty() + WARRANTY_INCREASE));
  }

}
