import java.util.InputMismatchException;
import java.util.Scanner;
public class Worker {
    private String name;
    private int salary;
    public static int counter=0;
    public void setName(String name) {
        this.name=name;

    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setSalary(int salary) throws Exception{
        this.salary=salary;
        if(salary<0) {
            throw new Exception();
        }
        counter++;
    }
}