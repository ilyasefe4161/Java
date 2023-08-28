abstract class Animal{
    String name;
    int number;
    Animal(String name, int number){
    //setName(name);
    //setNumber(number);
        this.name=name;
        this.number=number;
    }

    void setName(String name){
        this.name=name;
    }
    void setNumber(int number){
        this.number=number;
    }
    abstract void eat();
    void kiss(){
        System.out.println("animal is not kişner.");
    }
    void meow(){
        System.out.println("every animal do not meow.");
    }
    void name(){
        System.out.println("animal..");
    }
}