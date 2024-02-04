package Polymorphism;
class Pet{
   String name;
   String getName(){
    return name;
   }
   void setName(String name){
    this.name = name;
   }
   public String speak(){
    return "Hey it's pet";
   }
}
class Dog extends Pet{
  public String speak(){
    return "Hey it's Dog";
  }
}
class Cat extends Pet{
  public String fetch(){
    return "Hey, it's Cat";
  }
}

public class TestPolymorphism {
  public static void main(String args[]){
    Pet p;
    p = new Dog();
    System.out.println(p.speak());

    p = new Cat();
    System.out.println(p.speak());
  }
  
}
