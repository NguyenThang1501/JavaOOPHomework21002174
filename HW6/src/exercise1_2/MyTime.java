package exercise1_2;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour >= 0 && hour <= 23)
                && (minute >= 0 && minute <= 59)
                && (second >= 0 && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Invalid second");
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            hour++;
            if (hour >= 24) {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second <= -1) {
            second = 59;
            minute--;
            if (minute <= -1) {
                minute = 59;
                hour--;
                if (hour <= -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute <= -1) {
            minute = 59;
            hour++;
            if (hour <= -1) {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        hour--;
        if (hour <= -1) {
            hour = 23;
        }
        return this;
    }
}
