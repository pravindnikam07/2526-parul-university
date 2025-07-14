
public class CarRunner {

  public static void main(String[] args) {
    Car myCar = new Car(); // default constructor
    System.out.println(myCar); // prints the reference of the object
    myCar.model = "Toyota Camry";
    myCar.year = 2022;
    myCar.price = 30000.00;
    myCar.start("1245"); // call by value
    myCar.run(myCar); // call by reference
    myCar.printDetails();

    // using parameterized constructor with one argument
    Car myCar2 = new Car("Honda Accord");
    myCar2.printDetails();

    // using parameterized constructor with three arguments
    Car myCar3 = new Car("Honda Civic", 2022, 100000);
    myCar3.printDetails();
  }
}

class Car {

  // Attributes or variables
  String model;
  int year;
  double price;

  // constructors
  // Default constructor
  Car() {
    System.out.println("Inside the Default Constructor");
  }

  // Parameterized constructor
  Car(String model) {
    this.model = model;
    System.out.println("Inside the String Parameterized Constructor");
  }

  Car(String model, int year, double price) {
    this.model = model;
    this.year = year;
    this.price = price;
    System.out.println("Inside the String, int, double Parameterized Constructor");
  }

  // be
  void start(String key) {
    if (key == "1245")
      System.out.println("Car is starting" + " with key: " + key);
    else
      System.out.println("Invalid key: " + key);
  }

  void run(Car car) {
    System.out.println("Car is running");
  }

  void printDetails() {
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Price: " + price);
  }
}
