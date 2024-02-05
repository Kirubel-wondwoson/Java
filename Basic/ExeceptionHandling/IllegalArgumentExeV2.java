package ExceptionHandling;

import java.lang.*;

class Circle {
  double radius;

  Circle(double newRadius) {
    setRadius(newRadius);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double newRadius) {
    if(newRadius >= 0) {
      radius = newRadius;
    } else {
      throw new IllegalArgumentException("Radius can not be negative");
    }
  }

  public double findArea() {
    return radius * radius * Math.PI;
  }
}

public class IllegalArgumentExeV2 {
  public static void main(String args[]) {
    try{
      //Circle c1 = new Circle(5);
      Circle c2 = new Circle(-1);
      //System.out.println(c1.findArea());
      System.out.println(c2.findArea());
    }
    catch(IllegalArgumentException ex){
      System.out.println(ex);
    }
  }
}
