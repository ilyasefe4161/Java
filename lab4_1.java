import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new InputMismatchException();
        try{
            System.out.println("enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
        }
        catch (InputMismatchException exception){
            //error handling code
            System.out.println("There is a problem.");
            System.out.println(exception);
            System.out.println(exception.getMessage());
        }

    }


}