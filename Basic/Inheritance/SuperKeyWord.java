package Inheritance;

// Uses of Super keyword
// (1) To call a superclass constructor
// (2) To call a superclass method
class Animal{
  Animal(){
    System.out.println("Constructor is invoked");
  }
  void move(){
    System.out.println("Animal can move");
  }
}
class Dog extends Animal{
  // The constructor of the super class is automatically invoked and compiled since the constructor Animal has no argument
  void move(){
    super.move();
    System.out.println("Dogs can walk and run");
  }
}
public class SuperKeyWord {
  public static void main(String args[]){
    Dog d = new Dog();
    d.move();
  }
}
