package exercise1_3;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public String[] MONTHS() {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return months;
    }

    public String[] DAYS() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        return days;
    }

    public int[] DAYS_IN_MONTHS() {
        int[] dayInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dayInMonths;
    }

    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999
                || month < 1 || month > 12 || day < 1) {
            return false;
        }
        int maxDay;
        if (isLeapYear(year) && month == 2) {
            maxDay = 29;
        } else {
            maxDay = DAYS_IN_MONTHS()[month - 1];
        }
        if (day > maxDay) {
            return false;
        }
        return true;
    }

    public int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return -1;
        }
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

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Invalid year!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month!");
        }
    }

    public int getDay() {
        return day;
    }

    public int maxDay() {
        int maxDay;
        if (isLeapYear(year) && month == 2) {
            maxDay = 29;
        } else {
            maxDay = DAYS_IN_MONTHS()[month - 1];
        }
        return maxDay;
    }

    public void setDay(int day) {
        if (day < 1 || day > maxDay()) {
            this.day = day;
        } else {
            System.out.println("Invalid day!");
        }
    }

    public String toString() {
        if (isValidDate(year, month, day)) {
            return DAYS()[getDayOfWeek(year, month, day)] + " "
                    + day + " " + MONTHS()[month - 1] + " " + year;
        } else {
            return "Invalid year, month, or day!";
        }
    }

    public MyDate nextDay() {
        day++;
        if (day > maxDay()) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            year++;
        }
        if (day > maxDay()) {
            day = maxDay();
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (isLeapYear(year) && month == 2 && day == 28) {
            day = 29;
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            month--;
            if (month < 1) {
                month = 12;
                year--;
            }
            day = maxDay();
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            year--;
        }
        if (day > maxDay()) {
            day = maxDay();
        }
        return this;
    }

    public MyDate previousYear() {
        if (isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }
        year--;
        return this;
    }
}
