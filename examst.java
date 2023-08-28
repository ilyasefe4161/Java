import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat c1 = new Cat("zirzop",1,"sokak kedisi");
        Cat c2 = new Cat("aliş",0,"sokak kedisi");
        Cat c3 = new Cat("tarçın",3,"sokak kedisi");
        Cat c4 = new Cat("deniz",2,"sokak kedisi");
        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        cats.add(c4);
        System.out.println();
        //Collections.sort(cats, new numberComparator());
        Collections.sort(cats, new nameComparator());
        for (Cat a:cats) {
            System.out.println(a);
        }
    }
}