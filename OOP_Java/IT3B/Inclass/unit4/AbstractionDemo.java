
public class AbstractionDemo {
  public static void main(String[] args) {
    ATM atm = new SBI(); // parent class reference, child class object
    atm.withdraw();
    atm.showName();

    ATM hdfc = new HDFC();
    hdfc.withdraw();
    atm.showName();
  }
}

abstract class ATM {
  abstract void withdraw(); // abstract method

  int balance; // instance variable

  void showName() { // concrete method
    System.out.println("ATM");
  }
}

class SBI extends ATM {
  @Override
  void withdraw() {
    System.out.println("Balance: " + super.balance);
    System.out.println("Withdraw from SBI...");
  }
}

class HDFC extends ATM {
  @Override
  void withdraw() {
    System.out.println("Withdraw from HDFC...");
  }
}
