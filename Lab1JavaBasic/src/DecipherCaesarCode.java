import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        System.out.println("Enter a ciphertext string: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.next().toUpperCase();
        int n = 3;
        System.out.println("The plaintext string is: ");
        for (int i = 0; i < text.length(); i++) {
            int temp = text.codePointAt(i) - n;
            if (temp >= 65) {
                System.out.print((char) temp);
            } else {
                System.out.print((char) (temp + 26));
            }
        }
    }
}
