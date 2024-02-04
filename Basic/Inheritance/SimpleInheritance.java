package Inheritance;

class A {
  int a;

  void showA() {
    System.out.println("a : " + a);
  }
}

class B extends A {
  int b;
  void showB(){
    System.out.println("b : " + b);
  }
  void sum(){
    System.out.println("a + b : " + (a+b));
  }
}

public class SimpleInheritance {
  public static void main(String args[]){
    A superObj = new A();
    B subObj = new B();
    superObj.a = 10;
    superObj.showA();

    subObj.a = 20;
    subObj.showA();
    subObj.b = 30;
    subObj.showB();
    subObj.sum();
  }
}
 