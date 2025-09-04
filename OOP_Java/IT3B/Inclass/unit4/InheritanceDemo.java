
public class InheritanceDemo {

  public static void main(String[] args) {

    Dog dog = new Dog();
    dog.sound();
    dog.eat();

    Animal animal = new Animal();
    animal.sound();
    // animal.eat(); // This will give an error because Animal class does not have
    // eat() method


    Animal animal2 = new Animal(); // parent class reference and parent class object
    animal2.sound(); // animal makes a sound
    // animal2.eat(); // This will give an error because Animal class does not have eat() method

    Animal dog2 = new Dog();  // Parent class reference and child class object
    dog2.sound(); // dog barks
    // dog2.eat();

    Dog dog3 = new Dog(); // child class reference and child class object
    dog3.sound(); // dog barks
    dog3.eat(); // dog eats

  }
}

// Parent class or Super class or Base class
class Animal {

  void sound() {
    System.out.println("Animal makes a sound");
  }

}

// Child class or Sub class or Derived class
class Dog extends Animal {

  @Override // to indicate that we are overriding the method
  void sound() {
    System.out.println("Dog barks");
  }

  void eat() {
    System.out.println("Dog eats");
  }
}


class BabyDog extends Dog {
  @Override
  void sound() {
    System.out.println("Baby Dog barks");
  }

  void weep() {
    System.out.println("Baby Dog weeps");
  }
}
