package Inheritance;

public class ToString {
  int age;
  String name;
  public ToString(int age, String name){
    this.age = age;
    this.name = name;
  }  
  public static void main(String args[]){
    ToString obj = new ToString(21, "Kirubel");
    System.out.println(obj.toString());
  }
}
