public class Person {
    int id;
    String firstName;
    String lastName;
    int age;

    Person(int id, String firstName, String lastName, int age){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        id++;
        age=0;
    }
    Person(int id) {
        this.id = id;
    }
    Person() {
        id++;
    }
}
