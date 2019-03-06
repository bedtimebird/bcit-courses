public abstract class Electronics {

  private String brand;
  private double price;
  private int warranty; //in months

  public Electronics(String brand, double price, int warranty) {
    setBrand(brand);
    setPrice(price);
    setWarranty(warranty);
  }
  public void setBrand(String brand){
    this.brand = Checks.lengthString(brand);
  }
  public String getBrand(){
    return brand;
  }
  public void setPrice(double price){
    this.price = Checks.minDouble(price);
  }
  public double getPrice(){
    return price;
  }
  public void setWarranty(int warranty){
    this.warranty = Checks.minInt(warranty);
  }
  public int getWarranty(){
    return warranty;
  }

  public abstract void increasePrice(double percentage);

	@Override
	public String toString() {
		String line = "\n" + "Brand: " + getBrand() + "\n" +  "Price: $" + getPrice() + "\n" + "Warranty: " + getWarranty() + "mon";
		return line;
	}    

}
