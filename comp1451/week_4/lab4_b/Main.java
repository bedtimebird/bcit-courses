/**
* @author A00964363
* test driver for use in Repl.it
* cannot utilize Junit testing
*/
class Main {
  public static void main(String[] args) {
    BankAccount bankAcco1 = new BankAccount("Colleen", 100.50);
    BankAccount bankAcco2 = new BankAccount("Sam");
    System.out.println(bankAcco1.getBalance() + " balance account 1");
    BankAccount bankAcco3 = new BankAccount(null, 100);
    System.out.println(bankAcco3.getName() + " balance account 3");
    BankAccount bankAcco4 = new BankAccount("", 100);
    System.out.println(bankAcco4.getName() + " balance account 4");
    System.out.println(bankAcco2.getBalance() + " balance account 2");
    BankAccount bankAcco3 = new BankAccount("Sharon", -100);
    System.out.println(bankAcco5.getBalance());
    bankAcco1.deposit(200.10);
    System.out.println(bankAcco1.getBalance());
    bankAcco1.setName(null);
    System.out.println(bankAcco1.getName());
    bankAcco2.setName("");
    System.out.println(bankAcco2.getName());
    bankAcco2.setName("Bob");
    System.out.println(bankAcco2.getName());
    bankAcco1.deposit(-50.0);
    System.out.println(bankAcco1.getBalance());
    bankAcco1.withdraw(60.0);
    System.out.println(bankAcco1.getBalance());
    bankAcco1.withdraw(500.0);
    System.out.println(bankAcco1.getBalance());
    bankAcco1.withdraw(-60.0);
    System.out.println(bankAcco1.getBalance());
    bankAcco1.applyInterest();
    System.out.println(bankAcco1.getBalance());
    bankAcco2.applyInterest();
    System.out.println(bankAcco2.getBalance());
    bankAcco1.applyInterest();
    bankAcco1.applyInterest();
    System.out.println(bankAcco1.getBalance());
  }
}
