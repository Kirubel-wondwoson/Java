package Exercises.Final;

class Helper{
  public int x = 20;
}
public class Exercise2 {
  public void result(int x){
    int i, j;
    int c = 0;
    for(i = 25 ; i<= x ; i++){
      for(j = 1 ; j <= i ; j++){
        if(i%j == 0){
          c++;
        }
      }
      if(c == 2){
        System.out.print(i + ",");
        c=0;
      }
    }
  }
  public static void main(String[] args) {
    Exercise2 a = new Exercise2();
    a.result(50);
  }
}
