package Object;

class MyClass{
  String name = "Nameeee";
  void display(){
    System.out.println("Anonymous Object");
  }
}
public class AnonymousObjectClass {
  public static void main(String[] args) {
    // Anonymous Object : This is a good approach when we us object only once
    new MyClass().display();
  }
}
