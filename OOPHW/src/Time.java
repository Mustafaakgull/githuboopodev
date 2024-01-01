public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Time nextSecond() {
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 23) {
                    hour = 0;
                } else {
                    hour++;
                }
            } else {
                minute++;
            }
        } else {
            second++;
        }
        return this;
    }

    public Time previousSecond() {
        if (second == 0) {
            second = 59;
            if (minute == 0) {
                minute = 59;
                if (hour == 0) {
                    hour = 23;
                } else {
                    hour--;
                }
            } else {
                minute--;
            }
        } else {
            second--;
        }
        return this;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour");
            System.exit(1);
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.println("Invalid minute");
            System.exit(1);
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Invalid second");
            System.exit(1);
        }
    }
}
