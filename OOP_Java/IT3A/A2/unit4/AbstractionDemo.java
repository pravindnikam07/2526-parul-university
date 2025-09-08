public class AbstractionDemo {
  public static void main(String[] args) {

    ATM atm = new ATMImpl();
    atm.withdraw();
    atm.showBankName();
    // atm.sayHello(); // Error: cannot find symbol
    ATMImpl atmImpl = (ATMImpl) atm;
    atmImpl.sayHello();
    atmImpl.withdraw();
    atmImpl.showBankName();
  }
}
abstract class ATM {
  abstract void withdraw(); // abstract method
  void showBankName() { // concrete method
    System.out.println("Bank Name: ABC Bank");
  }
}
class ATMImpl extends ATM {

  @Override
  void withdraw() {
    System.out.println("Withdrawing money...");
    // 1000 lines of code logic for transfering the money.
  }
  void sayHello() {
    System.out.println("Hello from ATMImpl");
  }
}
