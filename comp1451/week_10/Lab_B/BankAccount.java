public class BankAccount {

  public final int MIN_BALANCE = 0;
  private String name;
  private double balance;

  public BankAccount(String name, double balance){
    setName(name);
    setBalance(balance);
  }
  public void setName(String name){
    if(name.trim().equals("") || name == null){
      this.name = "unknown name";
    } else {
      this.name = name;
    }
  }
  public String getName(){
    return name;
  }
  public void setBalance(double balance){
    if(balance > MIN_BALANCE) {
      this.balance = balance;
    } else {
      System.out.println("Must enter a value greater than " + MIN_BALANCE + " .");
    }
  }
  public double getBalance(){
    return balance;
  }
  public void deposit(double amount) throws NegativeAmountException{
    if (amount < 0){
      throw new NegativeAmountException("You cannot deposit a negative amount.");
    } else {
      this.balance += amount;
    }
  }
  public void withdraw(double amount) throws InsufficientFundException{
    if (amount > getBalance()){
      throw new InsufficientFundException("You cannot withdraw more than is in your account.");
    } else {
      this.balance -= amount;
    }
  }
  @Override
  public String toString(){
    String line = "Name: " + getName() + "\n" + "Account balance: $" + getBalance();
    return line;
  }
  
}
