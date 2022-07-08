package Day2;

public class Main {
    // perimeter = 2*3.141 * radius
    //area = PI * radius *radius
    private static double  radius = 4.5;
    public  static final  double pi = 3.1417;
    public static void main(String[] args) {
        double perimeter = 2 * pi * radius;
        double area = Math.PI * radius *radius;
        System.out.println("Perimeter is = "+ perimeter);
        System.out.println("Area is = "+ area);

    }
}
