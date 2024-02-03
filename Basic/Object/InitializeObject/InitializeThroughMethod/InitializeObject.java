package Object.InitializeObject.InitializeThroughMethod;

class MyClass {
  String fname, lname;
  int age;

  void insertRecord(String f, String l, int a) {
    fname = f;
    lname = l;
    age = a;
  }

  void display() {
    System.out.println("Name : " + fname + " " + lname);
    System.out.println("Age : " + age);
  }
}

public class InitializeObject {
  public static void main(String args[]) {
    MyClass myObj = new MyClass();
    myObj.insertRecord("Kirubel", "Wondwoson", 21);
    myObj.display();
  }
}
