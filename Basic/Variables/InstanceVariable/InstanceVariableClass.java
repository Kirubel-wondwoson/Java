package Variables;

public class InstanceVariableClass {

  // Instance Variable : they can be accessed by creating an object of a class in side methods
  
  String name = "Kirubel";
  int age = 21;

  public static void display(InstanceVariableClass obj) {
    System.out.println("Name : " + obj.name);
    System.out.println("Age : " + obj.age);
  }

  public static void main(String args[]) {
    InstanceVariableClass obj = new InstanceVariableClass();
    display(obj);
  }
}
