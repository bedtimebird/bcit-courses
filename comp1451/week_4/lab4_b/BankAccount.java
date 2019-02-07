 public class BankAccount {
   
   private String name;
   private double balance;
   public static final double DEFAULT_BALANCE = 0.0;
   public static final double INTEREST_RATE = 1.05;
   
   public BankAccount(String name, double balance) {
     setName(name);
     setBalance(balance);
   }
   public BankAccount(String name){
     setName(name);
     this.balance = DEFAULT_BALANCE;
   }

   public void setName(String name) {
     if (name == null || name.isEmpty()) {
       this.name = "unknown";
     } else {
        this.name = name;
     }
   }
   public String getName() {
     return name;
   }
  public void setBalance(double balance) {
      if (balance < 0) {
        this.balance = 0.0;
      } else {
        this.balance = balance;
      }
   }
   public double getBalance() {
     return balance;
   }
  public void deposit(double deposit){
     if(deposit > 0) {
       this.balance = balance + deposit; 
     } else {
       System.out.println("Deposit amount must be greater than 0.00");
     }
   }
  public void withdraw(double withdraw){
     if(withdraw > 0 && withdraw <= getBalance()) {
       this.balance = balance - withdraw; 
     } else {
       System.out.println("Withdrawal amount must be greater than 0.00 and less than or equal to account balance.");
     }
  }
  public void applyInterest() {
    this.balance = balance*INTEREST_RATE;
  }
  
 }
