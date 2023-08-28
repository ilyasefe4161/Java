import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        /*
        System.out.println("welcome ilyas efe sarısüleyman");

        User u = new User();
        u.name = "ilyas efe";
        u.membership = "Gold";
        u.age = 5;
        User u2 = new User();
        u2.name = "ies";
        u2.membership = "Silver";

        System.out.println(u.name);
        System.out.println(u.membership);
        System.out.println(u.age);

        System.out.println(u2.name);
        System.err.println(u2.membership);

        //System.out.printf("%s", u2.name);
        //System.err.println("%s", u2.membership);
         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first nummber: ");
        int number1 = input.nextInt();
        System.out.print("Enter second nummber: ");
        int number2 = input.nextInt();
        System.out.println("=> number1 + number2");
        System.out.println(" => " + number1 + number2);
        System.out.println("sum => " + (number1 + number2));
        System.out.println(number1 + " " + number2);
        System.out.println(number1 + number2);
        */

        int number = 5, number0 = 10, number1 = 0;
        System.out.printf("%s%n%d%n%s%n", "welcome", number, number0);
        System.out.println("Enter a number one to five: ");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        if (number1 < 5) {
            System.out.printf("number is %d%n",number1);
        }
        else
            System.out.println("!!! Please enter a number one to five !!!");

        System.out.println("Enter another number: ");
        int number2 = input.nextInt();
        System.out.println(number2);
    }
}