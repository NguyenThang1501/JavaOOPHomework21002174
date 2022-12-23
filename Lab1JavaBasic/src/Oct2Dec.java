public class Oct2Dec {
    public static void main(String[] args) {
        String octStr = "147";
        if (isValidOctal(octStr)) {
            System.out.println(convertOctToDec(octStr));
        } else {
            System.out.println("error: invalid oct string " + octStr);
        }
    }

    public static boolean isValidOctal(String lowercaseOctStr) {
        final String OCT_DIGITS = "01234567";
        for (int i = 0; i < lowercaseOctStr.length(); i++) {
            if (OCT_DIGITS.indexOf(lowercaseOctStr.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int convertOctToDec(String octStr) {
        int decimalValue = 0;
        for (int i = 0; i < octStr.length(); i++) {
            decimalValue = decimalValue * 8 + Character.getNumericValue(octStr.charAt(i));
        }
        return decimalValue;
    }
}

