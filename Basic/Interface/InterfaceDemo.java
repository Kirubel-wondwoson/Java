package Interface;
interface Animal {
  public void move();
  public void eat();
}
interface Animal2 {
  public void bark();
}
class Dog implements Animal, Animal2{
  public void move(){
    System.out.println("Dogs move...");
  }
  public void eat(){
    System.out.println("Dogs eat...");
  }
  public void bark(){
    System.out.println("Dogs bark...");
  }
}
public class InterfaceDemo {
  public static void main(String args[]){
    Dog d = new Dog();
    d.move();
    d.eat();
    d.bark();
  }
}
