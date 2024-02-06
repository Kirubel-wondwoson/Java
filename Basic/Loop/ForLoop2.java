package Loop;

public class ForLoop2 {
  public static void main(String[] args) {
    // Break and continue stmt 
    a:
    for(int i = 0 ; i < 3 ; i++){
      b:
      for(int j = 0 ; j < 3 ; j++){
        if(j == 2 && i == 2){
          break b;
        }
        System.out.println(i + " " + j);
      }
    }
  }
}
