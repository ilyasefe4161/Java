public class Horse extends Animal{
    String name;
    int number;
    Horse(String name, int number){
        super(name,number);
        this.name=name;
    }
    void kiss(){
        System.out.println("horses kişner.");
    }

    @Override
    void eat() {

    }
    public String toString(){
        return "Name:"+name;
    }
}
