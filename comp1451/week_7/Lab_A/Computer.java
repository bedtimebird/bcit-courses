public class Computer extends Electronics {

  private static final int WARRANTY_INCREASE = 12;

  private int cpuSpeed;
  private int memorySizeInGB;

  public Computer(String brand, double price, int warranty, int cpuSpeed, int memorySizeInGB){
    super(brand, price, warranty);
    setCpuSpeed(cpuSpeed);
    setMemorySizeInGB(memorySizeInGB);
  }
  public void setCpuSpeed(int cpuSpeed){
    this.cpuSpeed = Checks.minInt(cpuSpeed);
  }
  public int getCpuSpeed(){
    return cpuSpeed;
  }
  public void setMemorySizeInGB(int memorySizeInGB){
    this.memorySizeInGB = Checks.minInt(memorySizeInGB);
  }
  public int getMemorySizeInGB(){
    return memorySizeInGB;
  }

	@Override
	public String toString() {
		String line = super.toString() + "\n" + "CPU Speed: " + getCpuSpeed() + "MHz" + "\n" + "Memory size: " + getMemorySizeInGB() + "GB";
		return line;
	}    

  @Override
  public void increasePrice(double percentage){
    setPrice((getPrice()*(Checks.minDouble(percentage) + 1)));
    setWarranty((getWarranty() + WARRANTY_INCREAS));
  }


}
