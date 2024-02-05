package ExceptionHandling;

public class ArithmeticExeV3 {
  public double divide(double numnator, double denominator)
      throws ArithmeticException{
        if(denominator == 0){
          throw new ArithmeticException("Error: denominator can't be Zero");
        }
        else{
          return numnator/denominator;
        }
      }
  public static void main(String[] args) {
    try{
      ArithmeticExeV3 obj = new ArithmeticExeV3();
      System.out.println("Quotient : " + obj.divide(20, 0));

    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
  }
}
