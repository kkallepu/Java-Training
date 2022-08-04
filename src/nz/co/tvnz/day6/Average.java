package nz.co.tvnz.day6;

public class Average {
    int firstNo;
    int secondNo;
    int thirdNo;

    public Average(int firstNo, int secondNo, int thirdNo) {
        this.firstNo = firstNo;
        this.secondNo = secondNo;
        this.thirdNo = thirdNo;
    }

    void calculteAverage(){
        System.out.println("Average of three numbers is : "+(firstNo+secondNo+thirdNo)/3);
    }
}
class Answer3{
    public static void main(String[] args) {
        new Average(3,6,9).calculteAverage();
    }
}