public class Main {
    public static void main(String[] args) {
        int number=88,sum=0;
        for (int i=1; i<number; i++){
            if(number%i==0)
                sum=sum+i;
        }
        if (number==sum)
            System.out.println(number+" is a Mukemmel sayi");
        else
            System.out.println(number+" is not a Mukemmel sayi");
    }
}