package Variables;

public class LocalVariableClass {
  public static void display(){
    // Local Variables : they are created inside a method or a block and only accessed in that method 
    String name = "Kirubel";
    int age = 21;
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
  }
  public static void main(String args[]){
    display();
  }
}
