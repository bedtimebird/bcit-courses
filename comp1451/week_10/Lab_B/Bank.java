import java.util.Scanner;

public class Bank{

  private Scanner scanner;
  private BankAccount account;

  public Bank(BankAccount account){
    setBankAccount(account);
    scanner = new Scanner(System.in);
  }
  public void setBankAccount(BankAccount account){
    if (account != null) {
      this.account = account;
    }
  }
  public BankAccount getAccount(){
    return account;
  }
  public void processTransaction(){
    Scanner sc = new Scanner(System.in);
    boolean loopOpen = true;
    while(loopOpen){
      System.out.println("Choose the transaction type:");
      System.out.println("1. deposit");
      System.out.println("2. withdraw");
      System.out.println("3. display information");
      switch(sc.nextInt()){
        case 1: System.out.println("How much would you like to deposit?");
                double deposit = sc.nextDouble();
                try {
                  account.deposit(deposit);
                  loopOpen = choiceToEnd();
                  break;
                } catch(NegativeAmountException o) {
                  o.getMessage();
                  o.printStackTrace();
                }
        case 2: System.out.println("How much would you like to withdraw?");
                double withdrawal = sc.nextDouble();
                try{
                  account.withdraw(withdrawal);
                  loopOpen = choiceToEnd();
                  break;
                } catch(InsufficientFundException o){
                  o.getMessage();
                  o.printStackTrace();
                }
        case 3: System.out.println(account.toString());
                loopOpen = choiceToEnd();
                break;
        default: System.out.println("Incorrect selection provided.");
                  processTransaction();
                  break;
      }
    }
  }

  public boolean choiceToEnd() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Would you like to perform another action?");
    System.out.println("Yes = 1");
    System.out.println("No = 2");
    boolean end = false;
    switch(sc.nextInt()) {
      case 1: end = true;
              break;
      case 2: System.out.println("Goodbye");
              end = false;
              break;
      default: choiceToEnd();
    }
    return end;
  }    

}
