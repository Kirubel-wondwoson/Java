package Loop;

public class ForLoop {
  public static void main(String args[]){
     // 1
     for(int i = 0 ; i < 5 ; i++){
      for(int j = 0 ; j <= i ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();
    
    // 2
    for(int i = 0 ; i < 5 ; i++){
      for(int j = 0 ; j <= i ; j++){
        System.out.print("  ");
      }
      for(int j = i ; j < 5 ; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();

    // 3
    for(int i = 0 ; i <= 5 ; i++){
      for(int j = 5 ; j >= i ; j--){
        System.out.print("* ");
      }
      System.out.println();
    }
    System.out.println();

    // 4
    for(int i = 0 ; i <= 5 ; i++){
      for(int j = 5 ; j >= i ; j--){
        System.out.print("  ");
      }
      for(int j = i ; j >=0 ; j--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
