package Inheritance;

class Animal{
  public void move(){
    System.out.println("Animals can move");
  }
}
class Dog extends Animal{
  public void move(){
    super.move();
    System.out.println("Dog can walk and run");
  }
}
public class MethodOverriding {
  public static void main(String args[]){
    Animal superObj = new Animal();
    Dog subObj = new Dog();
    superObj.move();
    subObj.move();
  }
}
