package Exercises;
import java.util.*;
import java.lang.*;
import java.io.PrintStream.*;
public class ListPrimeNumbers {
	public static void main(String[] args)
	{
		String primaryNumFound = "";
		for(int i = 2 ; i < 100 ; i++){
			if(isPrime(i) == true){
				primaryNumFound = primaryNumFound + i + " ";
			}
		}
		System.out.println(primaryNumFound);
	}
	public static boolean isPrime(int num){
		for(int i=2 ; i <= Math.sqrt(num) ; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
}


