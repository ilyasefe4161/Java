import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter a number for hour: ");
        Scanner hour = new Scanner(System.in);
        int h1 = hour.nextInt();

        System.out.println("enter a number for minute: ");
        Scanner minute = new Scanner(System.in);
        int m1 = minute.nextInt();

        System.out.println("enter a number for second: ");
        Scanner second = new Scanner(System.in);
        int s1 = second.nextInt();

        Time t1= new Time();
        Time t2 = new Time();
        Time t3 = new Time();
        Time t4 = new Time();
        Time t5 = new Time();
        t1.setHour(h1);
        t2.setMinute(m1);
        t3.setSecond(s1);
        t4.toUniversalString();
        t5.toString();

    }
}