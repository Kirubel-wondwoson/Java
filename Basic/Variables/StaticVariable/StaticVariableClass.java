package Variables;

public class StaticVariableClass {
  // Static Variable : They are created out side method inside class under static non-access modifer and we can use them inside any method without creating an object

  static String name = "Kirubel";
  static int age = 21;
  
  public static void display() {
    System.out.println(name);
    System.out.println(age);
  }
  public static void main(String args[]) {
    System.out.println(name);
    display();
  }
}
