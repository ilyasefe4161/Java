import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an int value");
        int number1 = scanner.nextInt();
        System.out.println(number1);
        int number2 = scanner.nextInt();
        System.out.println(number2);

        System.out.println("sum: "+ (number1 + number2));




        //TestMethod();

//        String[] studNames = {"asdasd","asdas"};
//        float[] midScores = {15,20,30,90,85,45,65};
//        float[] finScores = {90,50,78,98,63,45,50};
//        float[] averScores = new float[7];
//
//        for (int i = 0; i<7;i++){
//            averScores[i] = getScore(midScores[i],finScores[i] );
//            System.out.println(averScores[i]);
//        }



    }

    private static void TestMethod() {
        System.out.println("Hello world!");

        Student s1 = new Student();
        s1.name= "asdasd";
        s1.mid =75;
        s1.fin =80;
        System.out.println(s1.getScore());

        Student s2 = new Student();
        s2.name = "asdsadsa";
        s2.mid = 95;
        s2.fin = 90;
        System.out.println(s2.getScore());
    }

    static float getScore(float mid, float fin){
        return mid *.4f + fin *.6f;
    }

//    static void test(){
//        //ifCondition(50, 45);
//        //switchCase('B');
//
//        // forLoop(20);
//        //forEachLoop();
//
//        //  whileLoop(20);
//        // doWhileLoop(20);
//
//    }

    static  void doWhileLoop(int limit){
        int input = 0;
        do{
            if (input % 2 == 0)
                System.out.println(input +" is even");
            else
                System.out.println(input +" is odd");
            input++;
        }
        while (input < limit);

    }

     static void whileLoop(int limit) {
       int x = 0;
        while ( x < limit){
            x+=1;
        }
        System.out.println(x);

    }


    static  void forEachLoop(){
        int[] numbers = new int[]{1,56,78,23,45};

        for(int number : numbers)
            System.out.println(number);
    }

    static  void forLoop(int maxVal){
        int result =0;
        for (int i = 0; i<=maxVal; i++)
            result +=i;
        System.out.println(result);
    }
    static void switchCase(char scoreCharacter){

        switch (scoreCharacter){
            case 'A':
                System.out.println("perfect");
                break;
            case 'B':
                System.out.println("not bad");
                break;
            case 'C':
                System.out.println("need to study more");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }

    static void ifCondition(float mid, float fin){
        float average = mid *.4f + fin *.6f;

        if (average < 35) System.out.println("failed");
        else if(average < 50) System.out.println("conditionally passed");
        else
            System.out.println("passed");
    }
}