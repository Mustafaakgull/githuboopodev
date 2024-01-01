public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) {
            this.day = day;
        } else {
            System.out.println("Invalid day");
            System.exit(1);
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ((month >= 1) && (month <= 12)) {
            this.month = month;
        } else {
            System.out.println("Invalid month");
            System.exit(1);
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if ((year > 1900) && (year < 9999)) {
            this.year = year;
        } else {
            System.out.println("year must be between 1900 and 9999");
            System.exit(1);
        }
    }


}
