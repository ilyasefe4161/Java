import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.name = "İlyas";
        worker1.socialSecurityNumber = 551;
        worker1.wage = 1000;
        worker1.workingHours = 8;

        displayInfo(worker1.name, worker1.socialSecurityNumber);
        displaySalary((int) worker1.wage, worker1.workingHours);

        Scanner scanner = new Scanner(System.in);
        Worker worker2 = new Worker();
        System.out.println("Write your name: ");
        worker2.name = scanner.next();
        System.out.println("Enter a Social Security Number: ");
        worker2.socialSecurityNumber = scanner.nextInt();
        System.out.println("Enter a Wage: ");
        worker2.wage = scanner.nextInt();
        System.out.println("Enter a Working Hours: ");
        worker2.workingHours = scanner.nextInt();

        displayInfo(worker2.name, worker2.socialSecurityNumber);
        displaySalary((int) worker2.wage, worker2.workingHours);

    }
    public static void displayInfo(String name, int socialSecurityNumber) {
        System.out.println(name + " " + socialSecurityNumber);
    }

    public static void displaySalary(int wage, int workingHours) {
        System.out.println (wage * workingHours);
    }
}