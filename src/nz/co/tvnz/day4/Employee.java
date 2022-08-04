package nz.co.tvnz.day4;

public class Employee {
    int id;
    float salary;
    String name;
    public Employee(int id, float salary, String name){
        this.id =id;
        this.name=name;
        this.salary = salary;
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
}
