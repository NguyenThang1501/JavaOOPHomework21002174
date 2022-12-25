import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.println("Key in your guess: ");
        int guessNumber = sc.nextInt();
        while (guessNumber != SECRET_NUMBER) {
            if (guessNumber > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else {
                System.out.println("Try higher");
            }
            guessNumber = sc.nextInt();
            count++;
        }
        System.out.println("You got it in " + count + " trials!");
    }
}
