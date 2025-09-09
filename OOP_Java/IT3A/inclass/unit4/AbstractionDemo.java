public class AbstractionDemo {
  public static void main(String[] args) {

    Bank sbi = new SBI(); // parent class reference, child class object
    sbi.getRateOfInterest();
    // sbi.getBonusROI(); // Compile-time error: method not found in parent class

    // syntax => childClass objectname = (childClass) parentClassObject
    SBI sbi2 = (SBI) sbi; // downcasting => whenever you are converting parent class object to child class
    // object is called object downcasting

    sbi2.getBonusROI();

    Bank icici = new ICICI();
    icici.getRateOfInterest();

    ICICI icici1 = new ICICI(); // child class reference, child class object
    Bank icici2 = icici1; // upcasting => whenever you are converting child class object to parent class
                          // object
  }
}

abstract class Bank {

  float repoRate = 6.0f;

  abstract void getRateOfInterest();
}

class SBI extends Bank {

  @Override
  void getRateOfInterest() {
    System.out.println("SBI Rate of Interest: " + repoRate * 1.5);
  }

  void getBonusROI() {
    System.out.println("SBI Bonus Rate of Interest: " + repoRate * 1.1);
  }
}

class ICICI extends Bank {

  @Override
  void getRateOfInterest() {
    System.out.println("ICICI Rate of Interest: " + repoRate * 1.3);
  }
}
