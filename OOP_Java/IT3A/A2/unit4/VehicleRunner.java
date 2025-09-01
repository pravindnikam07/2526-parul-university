
public class VehicleRunner {

  public static void main(String[] args) {

    Bike bike = new Bike();
    bike.color = "Red";
    bike.brand = "Hero";
    bike.engineType = "150cc";
    bike.startEngine();
    bike.selfBalancing();

  }
}

// Base or Parent Class
class Vehicle {
  String color;
  String brand;

  void startEngine() {
    System.out.println("Vehicle Engine started....");
  }

  void applyBreak() {
    System.out.println("Vehicle Break applied....");
  }
}

class Bike extends Vehicle {

  String engineType;

  void selfBalancing() {
    System.out.println("Bike is self balancing....");
  }

  // Overriding the startEngine method
  @Override
  void startEngine() {
    System.out.println("Bike Engine started....");
  }

}

class Car extends Vehicle {
  int door;

  void turnOnAC() {
    System.out.println("Car AC is turned on....");
  }
}
