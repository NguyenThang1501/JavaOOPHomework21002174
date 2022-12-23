import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        System.out.println("Enter a plaintext string: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.next().toUpperCase();
        System.out.println("The ciphertext string is: ");
        for (int i = 0; i < text.length(); i++) {
            int temp = text.codePointAt(i);
            System.out.print((char) (65 + 90 - temp));
        }
    }
}
