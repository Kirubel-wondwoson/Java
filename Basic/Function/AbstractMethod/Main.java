package Function.AbstractMethod;
import java.util.*;
import java.lang.*;
abstract class Shape{
  public abstract double findCircleArea(float r);
}
class Circle extends Shape{
  public double findCircleArea(float r){
    return (Math.PI * (r*r));
  }
}
public class Main {
  public static void main(String args[]){
    Shape circleObj = new Circle();
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the radius of the circle : ");
    float radius = input.nextFloat();
    System.out.println("Area : " + circleObj.findCircleArea(radius));
  }
}
