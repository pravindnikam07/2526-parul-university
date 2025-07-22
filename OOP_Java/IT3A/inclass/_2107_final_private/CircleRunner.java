
public class CircleRunner {
  public static void main(String[] args) {

    Circle c1 = new Circle(3);

    double areaC1 = c1.area();

    System.out.println(areaC1);
  }
}

class Circle {
  int radius;

  final double pi = 3.142;

  Circle(int radius) {
    this.radius = radius;
  }

  double area() {
    return pi * radius * radius;
  }

}
