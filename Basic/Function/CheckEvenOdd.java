package Function;
import java.util.*;
public class CheckEvenOdd {
  public static String checkEvenOdd(int num){
    String display;
    if(num%2 == 0){
      display = num + " is even.";
    }
    else{
      display = num + " is odd.";
    }
    return display;
  }
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = input.nextInt();
    System.out.println(checkEvenOdd(num));
  }
}
