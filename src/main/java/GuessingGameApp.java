import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args){
        Random rand = new Random();
        int randomNumber = rand.nextInt(11);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You have 3 Guesses");
        System.out.println("Please pick a number between 1-10:");
        Scanner scanner = new Scanner(System.in);
        int numberGuess = scanner.nextInt();
        int numberOfGuesses = 1;
        for ( ; numberOfGuesses < 3 ; numberOfGuesses++){
            if (numberGuess == randomNumber) {
                System.out.println("Congratulations, You have guessed correctly.");
                System.out.println("You have won!");
                break;
            }
            else if(numberGuess == -1){
                System.out.println("You have entered -1");
                System.out.println("You Lose");
                break;
            }
            else if (numberGuess == 0) {
                System.out.println("You have entered 0. Please enter a number between 1-10:");
                numberGuess = scanner.nextInt();
            }
            else{
                if(numberGuess < randomNumber){
                    System.out.println("You guessed " + numberGuess + ":");
                    System.out.println("The correct number is more than " + numberGuess + ":");
                    System.out.println("Guess again. You have " + (3 - numberOfGuesses) + " left:");
                    numberGuess = scanner.nextInt();
                }
                else{
                    System.out.println("You guessed " + numberGuess + ":");
                    System.out.println("The correct number is less than " + numberGuess + ":");
                    System.out.println("Guess again. You have " + (3 - numberOfGuesses) + " left:");
                    numberGuess = scanner.nextInt();
                }


                }
            }
        if (numberGuess != randomNumber && numberGuess != -1){
            System.out.println("You have used all your guesses.");
            System.out.println("You did not guess correctly.");
            System.out.println("You lose");
        }
        else if(numberGuess == randomNumber && numberOfGuesses == 3){
            System.out.println("Congratulations, you have guessed correctly.");
            System.out.println("You have won!");
        }

        }




}
