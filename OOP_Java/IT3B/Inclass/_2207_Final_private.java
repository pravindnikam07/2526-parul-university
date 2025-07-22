public class _2207_Final_private {
  public static void main(String[] args) {
    Circle c1 = new Circle(5);
    System.out.println(c1.area());
  }
}


class Circle {

  int radius;
  final double pi = 3.142;

  Circle(int radius) {
    this.radius = radius;
  }

  double area() {
    return this.pi * this.radius * this.radius;
  }
}

