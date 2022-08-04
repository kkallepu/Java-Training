package nz.co.tvnz.day6;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length*breadth;
    }

    public int getPerimeter() {
        return 2*(breadth+length);
    }
}
class Answers{
    public static void main(String[] args) {

        Rectangle a = new Rectangle(4, 5);
        Rectangle b = new Rectangle(5, 8);
        System.out.println(" Area : "+a.getArea()+" Perimeter is : "+ a.getPerimeter());
        System.out.println(" Area : "+b.getArea()+" Perimeter is : "+ b.getPerimeter());
    }

}