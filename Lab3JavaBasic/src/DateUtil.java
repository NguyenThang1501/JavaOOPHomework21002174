public class DateUtil {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int checkDay;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                checkDay = 31;
                break;
            case 4, 6, 9, 11:
                checkDay = 30;
                break;
            default:
                if (isLeapYear(year)) {
                    checkDay = 29;
                } else {
                    checkDay = 28;
                }
        }
        if (day != checkDay) {
            return false;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int firstDigitOfYear = year / 100;
        int temp = 0;
        switch (firstDigitOfYear % 4) {
            case 1:
                temp += 4;
                break;
            case 2:
                temp += 2;
                break;
            case 0:
                temp += 6;
        }

        switch (month) {
            case 3, 11:
                temp += 3;
                break;
            case 4, 7:
                temp += 6;
                break;
            case 5:
                temp += 1;
                break;
            case 6:
                temp += 4;
                break;
            case 8:
                temp += 2;
                break;
            case 9, 12:
                temp += 5;
                break;
        }
        if (!isLeapYear(year)) {
            if (month == 2) {
                temp += 3;
            }
        } else {
            if (month == 1) {
                temp += 6;
            } else if (month == 2) {
                temp += 2;
            }
        }
        temp += year % 100 + (year % 100) / 4 + day;
        return temp % 7;
    }

    public static String toString(int year, int month, int day) {
        String dayOfWeek = "";
        String monthStr = "";
        switch (getDayOfWeek(year, month, day)) {
            case 0:
                dayOfWeek = "Sunday";
                break;
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
        }
        switch (month) {
            case 1:
                monthStr = "Jan";
                break;
            case 2:
                monthStr = "Feb";
                break;
            case 3:
                monthStr = "Mar";
                break;
            case 4:
                monthStr = "Apr";
                break;
            case 5:
                monthStr = "May";
                break;
            case 6:
                monthStr = "Jun";
                break;
            case 7:
                monthStr = "Jul";
                break;
            case 8:
                monthStr = "Aug";
                break;
            case 9:
                monthStr = "Sep";
                break;
            case 10:
                monthStr = "Oct";
                break;
            case 11:
                monthStr = "Nov";
                break;
            case 12:
                monthStr = "Dec";
                break;
        }
        return dayOfWeek + " " + String.valueOf(day) + " " + monthStr + " " + String.valueOf(year);
    }
}
