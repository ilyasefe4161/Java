public enum Branch {
    MATH("ilyas", 90),
    PHYSICS("mary", 80),
    CS("eren",90),
    ENG("ensar",50);

    String studentname;
    int grade;

    Branch(String studentname, int grade) {
        this.studentname=studentname;
        this.grade=grade;
    }
}
