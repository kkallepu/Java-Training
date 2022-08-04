package nz.co.tvnz.day6;

public class Employee {
    String name;
    int joining_year;
    String address;

    }
class Answer1{
    public static void main(String[] args) {


        Employee sam = new Employee();
        sam.name = "Sam  ";
        sam.joining_year = 2004;
        sam.address = "10 abc street";

        Employee john = new Employee();
        john.name = "John";
        john.joining_year = 2000;
        john.address = "14 abc street";
        Employee robert = new Employee();
        robert.name = "Robert";
        robert.joining_year = 1999;
        robert.address = "17 abc street";
        System.out.println("Name\t Year of joining\t Address");
        System.out.println(sam.name+"\t\t"+sam.joining_year+"\t\t "+ sam.address);
        System.out.println(john.name+"\t\t"+john.joining_year+"\t\t "+ john.address);
        System.out.println(robert.name+"\t\t"+robert.joining_year+"\t\t "+ robert.address);



    }
}
