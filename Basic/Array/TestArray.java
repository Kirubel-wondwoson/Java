package Arrays;

import java.util.Scanner;

public class TestArray {
  public void acceptArray(int [][]nums, Scanner input, int n, int m){
    for(int i = 0 ; i < n ; i++){
      for(int j = 0 ; j < m ; j++){
        System.out.print("["+i+"]"+","+"["+j+"] : ");
        nums[i][j] = input.nextInt();
      }
    }
  }
  public void printArray(int [][]nums, int n, int m){
    for(int i = 0 ; i < n ; i++){
      for(int j = 0 ; j < n ; j++){
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n,m;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of row : " );
    n = input.nextInt();
    System.out.print("Enter the number of columns : ");
    m = input.nextInt();
    System.out.println("Enter array elements ");
    int [][]nums = new int[n][m];
    
    TestArray obj = new TestArray();
    obj.acceptArray(nums, input, n , m);
    obj.printArray(nums, n, m);
  }
  
}
