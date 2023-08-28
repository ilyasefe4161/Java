public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, Branch.CS);
        Teacher teacher2 = new Teacher(2, Branch.ENG);
        Teacher teacher3 = new Teacher(3, Branch.MATH);
        Teacher teacher4 = new Teacher(4, Branch.PHYSICS);

        Branch[] array = Branch.values();

       // Teacher[] array1 = {teacher1, teacher2, teacher3, teacher4};

        System.out.println(array.length);
//        System.out.println(teacher1.id);

 //       for (int i = 0; i< array1.length; i++)
   //         System.out.println(array1[i]);

        for (Branch i : array){
            System.out.println(i + " " + i.studentname +" "+ i.grade);
           // System.out.println();
        }
    }
}