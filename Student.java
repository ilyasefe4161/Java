public class Student {
    String name;
    float mid;
    float fin;

    float getScore(){
        return mid *.4f + fin *.6f;
    }

}
