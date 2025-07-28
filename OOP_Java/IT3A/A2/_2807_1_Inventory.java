public class _2807_1_Inventory {
  public static void main(String[] args) {
    Product product1 = new Product("Pen", 10, 12.5);
    System.out.println(product1.discountPrice());

    Product p2 = new Product();
    System.out.println(p2.discountPrice(50));

  }
}

class Product {
  // variables
  String name;
  int quantity;
  double price;

  // constructor
  // default constructor
  Product() {

  }

  Product(String name) {
    this.name = name;
    System.out.println("Inside the name param constructor");
  }

  // All arg constructor
  Product(String name, int quantity, double price) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    System.out.println("Inside the All arg constructor");
  }

  // Functionalities or methods
  // create a method to increase the quantity
  void increaseQuantity(int newQuantity) {
    this.quantity += newQuantity;
  }

  // update the product price
  void updatePrice(double newPrice) {
    this.price = newPrice;
  }

  // find the total amount for the user buying quantity
  double totalUserPrice(int quantity) {
    return this.price * quantity;
  }

  // give the 20% discount on the price
  double discountPrice() {
    return this.price * 0.80;
  }

  // give the discount on the price
  double discountPrice(int discount) {
    return this.price * ((100 - discount) / 100);
  }
}
