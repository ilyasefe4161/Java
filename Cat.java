import java.util.Comparator;
public class Cat extends Animal{
    String name;
    int number;
    String type;
    Cat(String name, int number, String type){
        super(name,number);
        //this.name=name;
        //this.number=number;
        setType(type);
    }
    void setType(String type){
        this.type=type;
    }
    void eat(){
        System.out.println("cat eat.");
    }
    void meow(){
        System.out.println("cat meow.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                '}';
    }
}