import java.util.Scanner;

public class WordGuess {

    public static void main(String[] args) {
        String word = "testing";
        boolean[] guess = new boolean[word.length()];
        Scanner sc = new Scanner(System.in);
        String guessStr = "";
        int count = 0;
        while (!guessStr.equals(word)) {
            System.out.print("Key in one character or your guess word: ");
            String temp = sc.next();
            if ((temp.length() > 1) && (temp.equals(word))) {
                guessStr = word;
            }else if (temp.length() == 1) {
                for (int i = 0; i < word.length(); i++) {
                    if (temp.charAt(0) == word.charAt(i)) {
                        guess[i] = true;
                    }
                }
                System.out.print("Trial " + (count + 1) + ":");
                for (int i = 0; i < word.length(); i++) {
                    if (guess[i]) {
                        System.out.print(word.charAt(i));
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }else{
                System.out.print("Trial " + (count + 1) + ":");
                System.out.println();
            }
            count++;
        }
        System.out.println("Congratulation!");
        System.out.println("You got in " + count + " trials");
    }

}
