
public class InheritanceDemo {

  public static void main(String[] args) {

    Animal dog1 = new Animal("Dog", "White");
    dog1.printDetails();
    dog1.makeSount();

    Animal cat1 = new Animal("Cat", "Black");
    cat1.printDetails();
    cat1.makeSount();

    Dog dog2 = new Dog();
    dog2.name = "Puppy";
    dog2.printDetails();
    dog2.makeSount();

    Cat cat2 = new Cat();
    cat2.name = "Kitty";
    cat2.printDetails();
    cat2.makeSount();

    Animal animal0 = new Animal(); // Parent class reference to parent class object
    Animal animal1 = new Dog(); // parent class reference to child class object
    Animal animal2 = null;

    animal0.makeSount();
    animal1.makeSount(); // due to dynamic method dispatch/runtime polymorphism
  }
}

class Animal {
  String name;
  String color;

  Animal() {
  }

  Animal(String name, String color) {
    this.name = name;
    this.color = color;
  }

  void printDetails() {
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
  }

  void makeSount() {
    System.out.println("Animal is making sound!");
  }
}

class Dog extends Animal {

  void makeSount() {
    System.out.println("Dog is barking!");
  }
}

class Cat extends Animal {
  void makeSount() {
    System.out.println("Cat is meowing!");
  }
}
