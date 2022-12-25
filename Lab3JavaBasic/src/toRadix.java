import java.util.Scanner;

public class toRadix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String radixStr = sc.next();
        System.out.print("Enter the input radix: ");
        int inputRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outputRadix = sc.nextInt();
        int decimalValue = convertRadixN2Dec(radixStr, inputRadix);
        System.out.println(radixStr + " in radix " + inputRadix + " is "
                + dec2RadixN(decimalValue, outputRadix) + " in radix " + outputRadix);
    }

    public static int convertRadixN2Dec(String radixStr, int radix) {
        int decimalValue = 0;
        for (int i = 0; i < radixStr.length(); i++) {
            decimalValue = decimalValue * radix + Character.getNumericValue(radixStr.charAt(i));
        }
        return decimalValue;
    }

    public static StringBuilder dec2RadixN(int dec, int radix) {
        StringBuilder result = new StringBuilder();
        int temp;
        while (dec != 0) {
            temp = dec % radix;
            if (temp >= 10) {
                result.append((char) (temp + 55));
            } else {
                result.append(temp);
            }
            dec /= radix;
        }
        return result.reverse();
    }

}
