import java.util.*;
public class Main {
    public static void main(String[] args) {
        //SuperInheritanceWeek8();
        //accessControlWeek8();
        //exerciseWeek9();
        //Week9();
        //Collection();
        //List();
        //LinkedList();
        //ArrayList();
        //finalExamQ3BankAccount2022();
        List<Cat> cats = new ArrayList<>();
        Cat c1 = new Cat("zirzop",2,"sokak kedisi");
        Cat c2 = new Cat("aliş",0,"sokak kedisi");
        Cat c3 = new Cat("tarçın",4,"sokak kedisi");
        Cat c4 = new Cat("deniz",3,"sokak kedisi");
        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        cats.add(c4);
        System.out.println();
        //Collections.sort(cats);
        for (Cat a:cats) {
            System.out.println(a);
        }
    }
    private static void finalExamQ3BankAccount2022() {
        ArrayList<BankAccount> myAccounts = new ArrayList<BankAccount>();
        myAccounts.add(new BankAccount(4,"ilyas",7000));
        myAccounts.add(new BankAccount(2,"ali",5000));
        myAccounts.add(new BankAccount(1,"eren",8000));
        myAccounts.add(new BankAccount(3,"selim",9000));
        Collections.sort(myAccounts);
        for(BankAccount a: myAccounts){
            a.balanceChange(5000);
            System.out.println(a);
        }
    }
    public static class BankAccount implements Comparable<BankAccount> {
        int accountNo;
        String holderName;
        double balance;

        public BankAccount(int accountNo, String holderName, double balance) {
            this.accountNo = accountNo;
            this.holderName = holderName;
            this.balance = balance;
        }

        void balanceChange(double amount) {
            this.balance -= amount;
        }

        @Override
        public int compareTo(BankAccount o) {
            return this.holderName.compareTo(o.holderName);
        }

        public String toString() {
            return "Account:" + accountNo + ", " + holderName + ", " + balance;
        }
    }
    private static void ArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("ali");
        arrayList.add("ilyas");
        arrayList.add("ensar");
        arrayList.add(2,"eren");
        ListIterator list = arrayList.listIterator(); // Obtaining ListIterator

        while (list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println();
        while (list.hasPrevious()){
            System.out.println(list.previous());
        }
    }
    private static void LinkedList() {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("ali");
        linkedList.addFirst("ilyas");
        linkedList.addLast("ensar");
        linkedList.add(2,"eren");
        linkedList.remove(0);
        ListIterator list = linkedList.listIterator(); // Obtaining ListIterator

        while (list.hasNext()){
            System.out.println(list.next());
            //list.remove();
        }
        System.out.println();
        while (list.hasPrevious()){
            System.out.println(list.previous());
        }
    }
    private static void List() {
        Horse h2 = new Horse("at2",2);
        Horse h3 = new Horse("at3",3);
        Horse h4 = new Horse("at4",4);

        List<Horse> productList = new ArrayList<>(); //type safety

        Horse[] animals = {h2,h3,h4};

        productList = Arrays.stream(animals).toList();

//      ListIterator<Horse> listIterator = productList.listIterator(productList.size());//listenin sonuna götürür.
        ListIterator<Horse> listIterator = productList.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println();
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
    private static void Collection() {
        Horse h2 = new Horse("at2",2);
        Horse h3 = new Horse("at3",3);
        Horse h4 = new Horse("at4",4);
        Collection<Horse> collection = new ArrayList<>(); //type safety
        collection.add(h2);
        collection.add(h3);
        collection.add(h4);
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("------------------");
        for ( Object horses: collection){
            System.out.println(horses);
        }
    }
    private static void Week9() {
        Horse horse = new Horse("at2",2);
        Animal h1 = new Horse("at3",3);
        Dog dog = new Dog("köpek4",4);
        Cat cat = new Cat("zirzop",1,"sokak kedisi");
        //Animal animal = cat;
        //Animal animal1 = new Animal("hayvan",0); //we can not do like this because of abstract.
        Animal animal = (Animal) cat;

        h1.kiss();
        //animal1.eat();
        System.out.println();

        animal.eat();
        System.out.println();

        ((Cat) animal).meow();//=animal.meow();
        animal.meow();

        System.out.println();

        animal.name();

        System.out.println();

        Animal[] animals = new Animal[]{cat,dog};
        for (Animal a:animals) {
            System.out.println("name:" + a.name + ", number:" + a.number);
            a.meow();
            a.eat();
            System.out.println();
        }

        if (horse instanceof Animal)
            System.out.println("horse instanceof Animal");
    }
    private static void exerciseWeek9() {
        class A {
            public void method1() { System.out.println("b1"); }
            public void method3() { System.out.println("b3"); }
        }
        class B extends A {
            public void method2() { System.out.println("b2"); }
            public void method3() { System.out.println("b3"); }
        }
        A a = new A();
        B b = new B();

        a.method1();  // b1
        //a.method2();  // yok
        a.method3();	// b3

        b.method1();// b1
        b.method2();// b2
        b.method3();// b3
    }
    private static void accessControlWeek8() {
        class Parent {
            private int attribute1;
            protected int attribute2;
            public int attribute3;
            protected final static int attribute5=1;
            private void method1(int attribute2) {}
            public void method2() {}
            protected void setAttribute1(int value){
                this.attribute1 = value;
            }
        }

        class Child extends Parent {
            public int attribute4;//ok

            public Child() {     // Which are legal?
                attribute4 = 0;        // first time,ok
                //attribute1++;      	// it is private
                attribute2++;      	// ok
                attribute3++;      	// ok
                //attribute5++;      	// not allowed

                super.method1(attribute2);     // _________
                method2();         	// _________

                setAttribute1(attribute4); // _____
            }
        }
    }
    private static void SuperInheritanceWeek8() {
        class Animal{
        String color="white";
        public void print(String color) {
            System.out.println(this.color);
        }
    }

        class Dog extends Animal{
            String color="black";
            //super.color;
            //super.print(color);

            public void test(String color) {
                super.color = super.color;//if open 3 of them is black
                super.color = color;//if open 3 of them is white

                super.print(super.color);
                super.print(this.color);
                super.print(color);
            }
            void printColor(){
                System.out.println(this.color);
                //prints color of Dog class

                System.out.println(super.color);
                //prints color of Animal class
            }
        }
        Dog d=new Dog(); //black
        d.printColor(); //white
        d.test(d.color);
    }
}

