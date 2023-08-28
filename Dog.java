class Dog extends Animal{
    String name;
    int number;
    Dog(String name, int number){
        super(name,number);
    }
    void eat(){
        System.out.println("dog eat.");
    }
}