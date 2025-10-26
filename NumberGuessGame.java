import java.util.*;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;

        System.out.println("🎯 Welcome to the Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Random number from 1 to 100
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nI have picked a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("\nEnter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts!");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("❌ Out of attempts! The correct number was " + numberToGuess + ".");
            }

            System.out.println("\nYour current score: " + score);
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = sc.next().toLowerCase();

            if (!response.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\n🏁 Game Over! Your final score: " + score);
        sc.close();
    }
}