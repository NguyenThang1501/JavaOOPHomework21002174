public class Bin2Dec {
    public static void main(String[] args) {
        String radixStr = "1001";
        if (checkBin(radixStr)) {
            int dec = convertBin2Dec(radixStr);
            System.out.println("The equivalent decimal number for binary " + radixStr + " is: " + dec);
        } else {
            System.out.println("error: invalid binary string " + radixStr);
        }
    }

    public static boolean checkBin(String radixStr) {
        String radixDigit = "01";
        for (int i = 0; i < radixStr.length(); i++) {
            if (radixDigit.indexOf(radixStr.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int convertBin2Dec(String radixStr) {
        int decimalValue = 0;
        for (int i = 0; i < radixStr.length(); i++) {
            decimalValue = decimalValue * 2 + Character.getNumericValue(radixStr.charAt(i));
        }
        return decimalValue;
    }
}