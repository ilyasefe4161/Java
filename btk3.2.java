import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max;
        System.out.println("enter number: ");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();

        System.out.println("enter number: ");
        Scanner n1 = new Scanner(System.in);
        int number1 = n1.nextInt();

        System.out.println("enter number: ");
        Scanner n2 = new Scanner(System.in);
        int number2 = n2.nextInt();

        if (number < number1) {
            max = number1;
            if (max < number2)
                System.out.println(number2);
            else System.out.println(max);
        } else {
            max = number;
            if (max < number2)
                System.out.println(number2);
            else System.out.println(max);
        }
    }
}