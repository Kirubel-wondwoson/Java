package Object.InitializeObject.InitializeThroughReference;

class MyClass {
  String fname, lname;
  int age;
}

public class InitializeObject {
  public static void main(String args[]) {

    // Initialization through reference
    MyClass myObj = new MyClass();
    myObj.fname = "Kirubel";
    myObj.lname = "Wondwoson";
    myObj.age = 21;
    System.out.println("Name : " + myObj.fname + " " + myObj.lname);
    System.out.println("Age : " + myObj.age);
    
  }
}
