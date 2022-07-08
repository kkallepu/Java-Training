package Day2;

public class Varibales {
     public static int  d = 100;
    private final int c =300;

    protected int e = 300;

    public void add(){
        int a = 10;
        int b = 20;
        System.out.println("addition of  a+b = "+ (a+b));
        System.out.println(d);

    }

    public static void main(String[] args) {
        System.out.println("static Variable = "+ d);
        System.out.println(new Varibales().c);
        new Varibales().add();

    }
}
