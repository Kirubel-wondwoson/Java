package Loop;

public class ForEachLoop {
  public static void main(String[] args) {
    // used to traverse array or collection 
    int []arr = {1,2,3,4,5};
    String []str = {"abc","cde"};
    for(int i:arr){
      System.out.print(i + " ");
    }
    System.out.println();
    for (String s : str) {
      System.out.print(s + " ");
    }
  }
}
