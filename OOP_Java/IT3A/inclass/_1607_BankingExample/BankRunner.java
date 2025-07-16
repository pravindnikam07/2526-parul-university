
public class BankRunner {

  public static void main(String[] args) {
    Bank user1 = new Bank("SBIN1345", "SBI", 1000.0);
    System.out.println("User 1 account balance " + user1.checkBalance("5431"));

    System.out.println("Message from user 1: " + user1.deposit(500.0));
    System.out.println("User 1 account balance " + user1.checkBalance("5432"));

    System.out.println(user1.withdraw(2000));
    System.out.println("User 1 " + user1.getBankName());

    Bank user2 = new Bank("SBIN2345", "SBI", 3000.0);
    System.out.println("User 2 " + user2.checkBalance("5432"));
    System.out.println("User 2 " + user2.getBankName());

    user1.updateBankName("State Bank of India");
    System.out.println("User 1 " + user1.getBankName());
    System.out.println("User 2 " + user2.getBankName());
  }
}

class Bank {

  private String accountNo;
  static private String bankName;
  private double balance;

  Bank(String accountNo, String BankName, double balance) {
    this.accountNo = accountNo;
    this.bankName = BankName;
    this.balance = balance;
  }

  String getBankName() {
    return this.bankName;
  }

  void updateBankName(String newBankName) {
    this.bankName = newBankName;
  }

  String checkBalance(String pin) {
    if (pin == "5432")
      return "Your balance is " + this.balance;
    else
      return "Invalid pin";
  }

  String deposit(double amountDeposit) {
    if (amountDeposit > 0) {
      this.balance += amountDeposit;
      return "amount deposited successfully";
    } else {
      return "amount should be greater than 0";
    }
  }

  String withdraw(double amountWithdraw) {
    if (amountWithdraw > 0 && amountWithdraw <= this.balance) {
      this.balance -= amountWithdraw;
      return "amount withdrawn successfully\nYour current balance is " + this.balance;

    } else {
      return "amount should be greater than 0 and less than or equal to current balance";
    }
  }

}
