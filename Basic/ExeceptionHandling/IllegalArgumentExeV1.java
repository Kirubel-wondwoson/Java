package ExceptionHandling;

public class IllegalArgumentExeV1 {
  int radius;
  public void setRadius(int newRadius)
    throws IllegalArgumentException{
      if(newRadius >= 0 ){
        radius = newRadius;
      }
      else{
        throw new IllegalArgumentException(
          "Radius can't be negative"
        );
      }
    }
  public static void main(String[] args) {
    int radius;
    IllegalArgumentExeV1 m = new IllegalArgumentExeV1();
    m.setRadius(-20);
  }
  
}
