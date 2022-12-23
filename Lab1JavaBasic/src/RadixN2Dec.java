public class RadixN2Dec {
    public static void main(String[] args) {
        String radixStr = "12";
        int radix = 8;
        System.out.println(isRadixStr(radixStr, radix));
        System.out.println(convertRadixN2Dec(radixStr, radix));
    }

    public static int convertRadixN2Dec(String radixStr, int radix) {
        int decimalValue = 0;
        for (int i = 0; i < radixStr.length(); i++) {
            decimalValue = decimalValue * radix + Character.getNumericValue(radixStr.charAt(i));
        }
        return decimalValue;
    }

    public static boolean isRadixStr(String radixStr, int radix) {
        String radixDigit = "";
        if (radix == 2) {
            radixDigit = "01";
        } else if (radix == 8) {
            radixDigit = "01234567";
        } else if (radix == 16) {
            radixDigit = "0123456789abcdef";
        } else {
            return false;
        }

        for (int i = 0; i < radixStr.length(); i++) {
            if (radixDigit.indexOf(radixStr.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
