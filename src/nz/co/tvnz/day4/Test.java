package nz.co.tvnz.day4;

import nz.co.tvnz.day5.BankAccount;

public class Test {
    public static void main(String[] args) {
//        Pen pen = new Pen();
//        pen.print();
//        System.out.println(pen.number);
//        pen.number = 100;
//        System.out.println(pen.number);
//        Pen pen1 = new Pen();
//        System.out.println(pen1.number);
//        System.out.println(pen.number);
//        Student s1 = new Student();
//        Student s2 = new Student();
//        s1.insertRecord(10,"Kiran");
//        s2.insertRecord(11, "Sisira");
//        System.out.println(s1.name +" "+ s1.rollNo);
//        System.out.println(s2.name + " "+s2.rollNo);
        Employee e1 = new Employee(1,2000, "Kiran");
        Employee e2 = new Employee(2,"abc");
        System.out.println(e1.salary);
        System.out.println(e2.salary);
        Student s1= new Student(2, "Tvnz");
        System.out.println(s1.name);


    }
}
