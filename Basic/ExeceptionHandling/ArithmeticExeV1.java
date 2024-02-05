package ExceptionHandling;

public class ArithmeticExeV1 {
  public static void main(String args[]){
    int a = 5;
    int b = 0;
    try{
      System.out.println(a/b);
    }
    catch(ArithmeticException e){
      e.printStackTrace();
      // Or
      // System.out.println(e.toString());
      // System.out.println(e.getMessage());
    }
  }
}
