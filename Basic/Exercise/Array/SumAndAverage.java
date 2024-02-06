package Exercises.Array;

import java.util.Scanner;

public class SumAndAverage {
    public void accept(double[] arr, int n){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 5 intege values");
    for(int i = 0 ; i < n ; i++){
      System.out.print("Num "+(i+1)+": ");
      arr[i] = input.nextInt();
    }
  }
  public double sum(double[] arr, int n){
    double sum = 0;
    for(int i = 0 ; i < n ; i++){
      sum += arr[i];
    }
    return sum;
  }
  public double avg(double[] arr, int n){
    double avg = sum(arr,n)/n;
    return avg;
  }
  public void display(double[] arr, int n ){
    System.out.println("Sum : " + sum(arr, n));
    System.out.println("Average : " + avg(arr, n));
  }
  public static void main(String[] args) {
    int size;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size : ");
    size = input.nextInt();
    double[] array = new double[size];
    
    SumAndAverage obj = new SumAndAverage();
    obj.accept(array, size);
    obj.display(array, size);
  }
}
