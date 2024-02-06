package Exercises.Array;

import java.util.Scanner;

public class RandomExe {
  public void accept(int[] arr){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 5 intege values");
    for(int i = 0 ; i < 5 ; i++){
      System.out.print("Num "+(i+1)+": ");
      arr[i] = input.nextInt();
    }
  }

  public int findSmallest(int[] arr){
    System.out.println("The Smallest ");
    int small = arr[0];
    for(int i = 1 ; i < 5 ; i++){
      if(arr[1] < arr[0]){
        small = arr[1];
      }
    }
    return small;
  }
  public void EvenNums(int[] arr){
    System.out.println("Even numbers");
    for(int i = 0 ; i < 5 ; i++){
      if(arr[i]%2 == 0){
        System.out.print(arr[i]+" ");
      }
    }
  }
  public int NumsAboveFifty(int[] arr){
    int count = 0;
    System.out.println(9);
    System.out.println(("Numbers above 50"));
    for(int i = 0 ; i < 5 ; i++){
      if(arr[i] > 50){
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] array = new int[5];

    RandomExe obj = new RandomExe();
    obj.accept(array);

    System.out.println(obj.findSmallest(array));
    obj.EvenNums(array);
    System.out.println(obj.NumsAboveFifty(array));

  }
}
