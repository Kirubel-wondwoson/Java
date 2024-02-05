package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExeV2 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Numnator : ");
    int a = input.nextInt();
    System.out.print("Enter the denominator : ");
    int b = input.nextInt();
    try{
      if(b == 0){
        throw new ArithmeticException("Divisor can not be Zero");
      }
      System.out.println(a/b);
    }
    catch(ArithmeticException e){
      System.out.println("Exception: Division by Zero is invalid");
    }
  }
}
