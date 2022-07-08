package Day1;

public class Student {
    private int rollNumber= 22;
    private String Name = "hjdfsgfs";
    private int age = 11;

//    public Student(int rollNumber, String name, int age) {
//        this.rollNumber = rollNumber;
//        Name = name;
//        this.age = age;
//    }

    public int getRollNumber() {
//        rollNumber =11;
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return Name;
    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
}
