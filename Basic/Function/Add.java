package Function;
import java.util.*;
public class Add {
  public static double add(double n1 , double n2){
    double sum = n1 + n2;
    return sum;
  }
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers");
    System.out.print("Number 1 : ");
    double n1 = input.nextDouble();
    System.out.print("Number 2 : ");
    double n2 = input.nextDouble();
    
    double result = add(n1, n2);
    System.out.println("Sum = " + result);
  }
}
