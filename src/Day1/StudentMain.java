package Day1;

import Day2.Varibales;

public class StudentMain {
    public static void main(String[] args) {
        int ab = Varibales.d;
//        int bb = new Varibales().e;
        Student student = new Student();
        Student student1 = new Student();
//        student.age = 133;
//        student.Name = "vikram";
//        student.rollNumber = 2;
//        student1.age = 11;
//        student1.Name = "Indica";
//        student1.rollNumber = 3;
        System.out.println("before  "+ student.getRollNumber());
        System.out.println("before  "+student1.getRollNumber());
        student.setRollNumber(356);
        student1.setRollNumber(653);
        System.out.println("after  "+student.getRollNumber());
        System.out.println("after : "+ student1.getRollNumber());
        System.out.println(student.getName());
        System.out.println(student1.getName());


        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(+ 15 / 3 * 2 - 8 % 3);


    }
}
