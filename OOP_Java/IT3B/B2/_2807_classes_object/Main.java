
public class Main {
  public static void main(String[] args) {
    Product p1 = new Product("tab", 12, 1345.4);
    System.out.println(p1.updatePrice(433));
    System.out.println(p1.calculateDiscount(50));
    System.out.println(p1.findTotal(10));
    Product p2 = new Product();
    p2.updatePrice(20);
    System.out.println(p2.findTotal(10));
    System.out.println(p2.calculateDiscount(20));

  }
}
/*
 * Create a class named Product and having following attributes
 * 1. name
 * 2. quantity
 * 3. price
 *
 * constructors:
 * 1. default constructor => print the message "Default constructor called."
 * 2. all arg constructor => print the message
 * "All argument constructor called."
 *
 * Functionalities
 * 1. create a updatePrice method to update the price.
 * 2. calculate the total amount for n quantities
 * 3. calculate the discount
 */

 // Product, Bank, Person, Employee, Student, Book

class Product {

  // creating the variables
  String name;
  int quantity;
  double price;

  // creating the constructor
  // default
  Product() {
    System.out.println("Default constructor called.");
  }

  Product(String name) {
    this.name = name;
    System.out.println("One param name constructor called.");
  }

  // all arg
  Product(String name, int quantity, double price) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    System.out.println("All argument constructor called.");
  }

  // Functionalities or method
  double updatePrice(double newPrice) {
    this.price = newPrice;
    return this.price;
  }

  double findTotal(int quantity) {
    return this.price * quantity;
  }

  double calculateDiscount(double discount) {

    return this.price * ((100 - discount) / 100);
  }
}
