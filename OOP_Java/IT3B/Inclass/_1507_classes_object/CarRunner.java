
public class CarRunner {

  public static void main(String[] args) {
    Car car1 = new Car(); // default constructor
    car1.printDetails();
    car1.model = "Toyota";
    car1.year = 2020;
    car1.price = 30000.0;
    car1.start();
    car1.run();
    car1.printDetails();

    // creating car object using parameterized constructor
    Car car2 = new Car("Honda", 2023, 2300000.80);
    car2.printDetails();
    car2.start();
    car2.run();

    Car car3 = new Car("BMW");
    car3.printDetails();
    car3.run();
    car3.start(6543);


  }
}

class Car {

  // Attributes or variables
  String model;
  int year;
  double price;

  Car() {
    System.out.println("Inside default constructor");
  }

  Car(String model, int year, double price) {
    this.model = model;
    this.year = year;
    this.price = price;
    this.start();
    System.out.println("Inside parameterized constructor");
  }

  Car(String model) {
    this.model = model;
  }

  // behaviors or methods
  void start() {
    System.out.println("Car is starting");
  }

  void start(int pin) {
    if (pin == 6543) {
      System.out.println("Car is starting");
    } else {
      System.out.println("Invalid pin to the ola");
    }
  }

  void run() {
    System.out.println("Car is running");
  }

  void printDetails() {
    System.out.println("Model: " + this.model);
    System.out.println("Year: " + this.year);
    System.out.println("Price: " + this.price);
  }
}
