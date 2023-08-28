
public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
//        Worker w2 = new Worker();
//        Worker w3 = new Worker();
        w1.setName("ahmet");
        w1.setName("Chris");
        w1.setName("Heria");
        try {
            w1.setSalary(5);
            w1.setSalary(12);
            w1.setSalary(-8);
        }catch(Exception e){
            System.out.println("salary amount must be greater than zero");
            System.out.println(e);
        }
        System.out.println("Amounts of workers: "+Worker.counter);
    }

}