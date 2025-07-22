
public class BankRunner {

  public static void main(String[] args) {

    Bank bank = new Bank("Ravi");
    System.out.println(bank.getAccountNumber());
    System.out.println(bank.getName());
    bank.setName("Ravikant");
    System.out.println(bank.getName());
  }
}

class Bank {
  private String name;
  private int accountNumber;
  private double balance;

  Bank(String name) {
    this.name = name;
    this.accountNumber = (int) (Math.random() * 100000);
    this.balance = 500.0;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public void setName(String name) {
    
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

}
