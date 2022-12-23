import java.util.Scanner;

public class TestPalindromic {
    public static boolean TestPalindromicWord(String word) {
        word = word.toLowerCase();
        int fIdx = 0, bIdx = word.length() - 1;
        while (fIdx < bIdx) {
            if (word.charAt(fIdx) != word.charAt(bIdx)) {
                return false;
            }
            fIdx++;
            bIdx--;
        }
        return true;
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static boolean TestPalindromicPhrase(String phrase) {
        phrase = phrase.replaceAll(" ", "");
        for (int i = 0; i < phrase.length(); i++) {
            int temp = phrase.codePointAt(i);
            if (temp < 65 || (temp > 90 && temp < 97) || temp > 122) {
                phrase = removeCharAt(phrase, i);
            }
        }

        phrase = phrase.toLowerCase();
        int fIdx = 0, bIdx = phrase.length() - 1;
        while (fIdx < bIdx) {
            if (phrase.charAt(fIdx) != phrase.charAt(bIdx)) {
                return false;
            }
            fIdx++;
            bIdx--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if (TestPalindromicWord(word)) {
            System.out.println("A palindromic word.");
        } else {
            System.out.println("Not a palindromic word.");
        }

        System.out.println("Enter a phrase");
        String phrase = sc.nextLine();
        TestPalindromicPhrase(phrase);
        if (TestPalindromicPhrase(phrase)) {
            System.out.println("A palindromic phrase.");
        } else {
            System.out.println("Not a palindromic phrase");
        }
    }
}
