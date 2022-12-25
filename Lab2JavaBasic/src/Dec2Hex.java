import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        String StrHex = "";
        System.out.print("The equivalent hexadecimal number is ");
        while (number != 0) {
            int remainder = number % 16;
            if (remainder < 10) {
                StrHex = remainder + StrHex;
            } else {
                char remainderStr = (char) (remainder - 10 + 65);
                StrHex = remainderStr + StrHex;
            }
            number /= 16;
        }
        System.out.print(StrHex);
    }
}
