import java.util.Scanner;
import java.lang.*;

public class CheckHexStr {
    public static boolean checkHexStr(String radixStr) {
        String radixDigit = "0123456789abcdef";
        for (int i = 0; i < radixStr.length(); i++) {
            if (radixDigit.indexOf(radixStr.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String Str = sc.nextLine();
        if (checkHexStr(Str)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
