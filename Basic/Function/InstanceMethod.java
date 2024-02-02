package Function;

public class InstanceMethod {
  public static void main(String args[]){
    //To use instance method object of the class must be created
    InstanceMethod obj = new InstanceMethod();
    System.out.println(obj.add(20, 30));
  }
  public int add(int n1,int n2){
    return (n1+n2);
  }
}
