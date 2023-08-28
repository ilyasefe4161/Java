import java.util.Scanner;

public class account {
    private double balance;
    private String ownerName;

    public account(String name, double balance){

    }
    public void add(double amount){

    }
    public static void withdraw(double amount){
        System.out.println("Please enter the 4-digits pass: ");
        Scanner scanner = new Scanner(System.in);
        int password = scanner.nextInt();
        for (int i = 0; i < 2; i++) {
            if (password == 1234) {
                System.out.println("You enter succesfully.");
                System.out.println("If you want withdraw money. Please enter 1.");
                System.out.println("what do you want to do? ");
                int text = scanner.nextInt();
                if (text == 1)
                    System.out.println("your money is " + amount);
                break;
            } else
                System.out.println("Your account has been blocked, please try again later.");
        }




    }

    public double getBalance() {
        return balance;
    }
    public void setOwnerName(String name){

    }
    public String getOwnerName(){
        return ownerName;
    }
}

