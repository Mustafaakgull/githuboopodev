public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(1, 1, 59);
        System.out.println(t1);
        System.out.println(t1.nextSecond());
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond());

        t1.setHour(23);

        System.out.println(t1);
        Date d1 = new Date(1, 1, 2019);
        System.out.println(d1);


    }
}