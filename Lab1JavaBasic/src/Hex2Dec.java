public class Hex2Dec {
    public static void main(String[] args) {
        String hexString = "134abc";
        if (isValidHexString(hexString)) {
            System.out.println(convertHexToDecimal(hexString));
        } else {
            System.out.println("error: invalid hex string " + hexString);
        }
    }

    public static boolean isValidHexString(String lowercaseHexString) {
        final String HEX_DIGITS = "0123456789abcdef";
        for (int i = 0; i < lowercaseHexString.length(); i++) {
            if (HEX_DIGITS.indexOf(lowercaseHexString.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int toHexDigit(char ch) {
        final String HEX_DIGITS = "0123456789abcdef";
        return HEX_DIGITS.indexOf(ch);
    }

    public static int convertHexToDecimal(String hexString) {
        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            decimalValue = decimalValue * 16 + toHexDigit(hexString.charAt(i));
        }
        return decimalValue;
    }
}
