public class AnimalRunner {
  public static void main(String[] args) {

    Animal animal = new Animal();
    animal.sound();

    Animal animal1 = new Cat();
    animal1.sound();

    Animal animal2 = new Dog();
    animal2.sound();
  }
}

class Animal {
  String name;
  int age;

  void sound() {
    System.out.println("Animal makes a sound...");
  }
}

class Cat extends Animal {

  @Override
  void sound() {
    System.out.println("Cat meows...");
  }
}

class Dog extends Animal {

  @Override
  void sound() {
    System.out.println("Dog barks...");
  }
}
