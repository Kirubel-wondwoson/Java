package ExceptionHandling;

public class IllegalArgumentExeV3 {
  int radius;
  public IllegalArgumentExeV3(int newRadius){
    setRadius(newRadius);
  }
  public void setRadius(int newRadius)
     throws IllegalArgumentException{
      if(newRadius >= 0){
        radius = newRadius;
      }
      else{
        throw new IllegalArgumentException(
          "Radius can't be negative"
        );
      }
     }
  public static void main(String[] args) {
    try{
      IllegalArgumentExeV3 obj = new IllegalArgumentExeV3(-3);
      IllegalArgumentExeV3 obj2 = new IllegalArgumentExeV3(2);
    }
    catch(IllegalArgumentException e){
      System.out.println(e);
    }
  }
}
