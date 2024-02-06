package Exercises.Array;
import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate 5 random numbers between 10 and 20 (inclusive)
        for (int i = 0; i < 5; i++) {
            int randomNum = random.nextInt(11) + 10;  // 11 to include 20
            System.out.println(randomNum);
        }
    }
}
