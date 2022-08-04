package nz.co.tvnz.day4;

public class Student {
    int rollNo;
    String name;
    void insertRecord(int r, String n){
        rollNo= r;
        name =n;
    }

    public Student(int r, String name){
        this.rollNo= r;
        this.name = name;
    }
}
