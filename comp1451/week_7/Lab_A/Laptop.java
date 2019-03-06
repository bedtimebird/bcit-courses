public class Laptop extends Computer {

  private double screenSize;

  public Laptop(String brand, double price, int warranty, int cpuSpeed, int memorySizeInGB, double screenSize){
    super(brand, price, warranty, cpuSpeed, memorySizeInGB);
    setScreenSize(screenSize);
  }
  public void setScreenSize(double screenSize){
    this.screenSize = Checks.minDouble(screenSize);
  }
  public double getScreenSize(){
    return screenSize;
  }
	@Override
	public String toString() {
		String line = super.toString() + "\n" + "Screen size: " + getScreenSize() + "\"";
		return line;
	}      

}
