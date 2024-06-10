import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int result,guess;
        boolean correct=false;
        Scanner sc1=new Scanner(System.in);
        Random random=new Random();
        result = random.nextInt(100) + 1;

        while (!correct) {
            System.out.println( "Guess a number between 1 and 100: "); 
            guess = sc1.nextInt(); 

            if (guess > result) { 
                System.out.println("Too high, try again"); 
            } 
  
            else if (guess < result) { 
                System.out.println("Too low, try again"); 
            } 
  
            else { 
                System.out.println("Yes, you guessed the number."); 
                correct = true; 
            }
        }
    }
}