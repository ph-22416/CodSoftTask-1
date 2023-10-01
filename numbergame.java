import java.util.Random;
import java.util.Scanner;

public class numbergame {

    public static void main(String[] args) {
        // 1. Generate a random number within a specified range, such as 1 to 100.
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess;

        do {
            // 2. Prompt the user to enter their guess for the generated number.
            System.out.println("Enter your guess (1 to 100): ");
            userGuess = scanner.nextInt();

            // 3. Compare the user's guess with the generated number and provide feedback.
            if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (userGuess != randomNumber);
        
        scanner.close();
    }
}
