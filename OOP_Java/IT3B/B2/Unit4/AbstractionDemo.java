public class AbstractionDemo {
  public static void main(String[] args) {

    ATM atm = new ATMImpl();
    atm.withdraw();
    atm.showBankName();
    // atm.isMoneyTransferred(); // error: connot find symbol

    // Object downcasting
    ATMImpl atmImpl = (ATMImpl) atm; // downcasting
    atmImpl.isMoneyTransferred();
    atmImpl.showBankName();
    atmImpl.withdraw();
  }
}

// Abstrct class have the abstract methods and concrete methods
// You can not create the object of abstract class
abstract class ATM {
  abstract void withdraw(); // abstract method => without body

  void showBankName() { // concrete method => with body
    System.out.println("Bank of Java");
  }
}

class ATMImpl extends ATM {

  @Override
  void withdraw() {
    // logic to withdraw money => 1000 lines of code
    System.out.println("Withdrawing money...");
  }

  void isMoneyTransferred() {
    System.out.println("Money transferred...");
  }
}
