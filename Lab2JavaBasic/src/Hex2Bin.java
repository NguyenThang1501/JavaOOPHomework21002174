import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        System.out.print("Enter a Hexadecimal string: ");
        Scanner sc = new Scanner(System.in);
        String StrHex = sc.next();
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        System.out.print("The equivalent binary for hexadecimal " + StrHex + " is: ");
        StrHex = StrHex.toUpperCase();
        for (int i = 0; i < StrHex.length(); i++) {
            char inChar = StrHex.charAt(i);
            int index;
            if (inChar >= '0' && inChar <= '9') {
                index = Integer.parseInt(String.valueOf(inChar));
            } else {
                index = inChar - 65 + 10;
            }
            System.out.print(HEX_BITS[index] + " ");
        }
    }
}
