package nz.co.tvnz.day6;

public class Student {
    String name;
    int roll_no;
    int phone_no;
    String address;

    @Override
    public String toString() {
        return "Name is "+ this.name + "and roll number is " + this.roll_no +" and phone no is " +this.phone_no + "address is "+ this.address;
    }
}
class Answer{
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Kiran";
        student.roll_no = 2;
        System.out.println(student);

        Student sam = new Student();
        sam.name = "Sam";
        sam.roll_no = 3;
        sam.phone_no = 111111111;
        sam.address = "10 abc street";
        System.out.println(sam);

        Student john = new Student();
        john.name = "John";
        john.roll_no = 4;
        john.phone_no = 444444444;
        john.address = "14 abc street";
        System.out.println(john);
    }
}
