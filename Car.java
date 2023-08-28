public class Car {
    private Person owner;
    private String color;
    private String model;
    Car(Person owner, String color, String model){
        this.owner=owner;
        this.color=color;
        this.model=model;
    }
    public void changeOwner(Person person){
        this.owner=person;
    }
    public Person getOwner(){
     return this.owner;
    }
    public void showInfo(){
        System.out.println(owner+color+model);
    }
}
