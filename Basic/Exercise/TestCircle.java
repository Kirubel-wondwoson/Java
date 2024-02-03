package Exercises;

import java.util.*;
import java.lang.*;

class Circle {
  double radius;

  public double FindArea() {
    return (Math.PI * radius * radius);
  }

  public double FindCircum() {
    return (2 * Math.PI * radius);
  }
}

public class TestCircle {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    Circle circle1 = new Circle();

    // Accept
    System.out.print("Enter the radius of the circle : ");
    circle1.radius = input.nextDouble();
    // Display
    System.out.println("Area = " + circle1.FindArea());
    System.out.println("Circumference = " + circle1.FindCircum());
  }
}
