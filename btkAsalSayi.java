public class Main {
    public static void main(String[] args) {
/*        int number = 1;
//        int remain=number%2;
//        System.out.println(remain);

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("This is not a prime number.");
                return;
            }
        }
        if (number == 1)
            System.out.println("This is not a prime number.");
        else
            System.out.println(number + " is a prime number.");
        return;*/

        int number = 23;
//        int remain=number%2;
//        System.out.println(remain);
        boolean isPrime=true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime=false;
            }
        }
        if (number <= 1)
            System.out.println("This is not a prime number.");
        else if (isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println("This is not a prime number.");

    }
}