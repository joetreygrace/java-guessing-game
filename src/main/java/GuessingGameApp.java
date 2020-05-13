import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Please enter a number between 1-10:");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        if(guess == 7) {
            System.out.println("Congratulations you have won!");
        }
        else if(guess == 0){
            System.out.println("You have entered 0. Please enter a number between 1-10:");
            guess = input.nextInt();
            if(guess == 7){
                System.out.println("Congratulations you have won!");
                            }
            else{
                System.out.println("You Have Guessed Incorrectly");
            }
                    }
        else {
            System.out.println("You Have Guessed Incorrectly");
        }
        if (guess != 7){
            System.out.println("Please try another number:");
            guess = input.nextInt();
            if (guess == 7){
                System.out.println("You have Won!");
            }
            else{
                System.out.println("You have Lost.");
            }
        }
    }

}
