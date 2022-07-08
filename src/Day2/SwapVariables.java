package Day2;

public class SwapVariables {
    int aa= Varibales.d;
    int bb = new Varibales().e;

//    int cc = new Varibales();
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
//        int c = b;
//        b = a;
//        a=c;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("variable a = " + a);
        System.out.println("variable b = " + b);

    }
}
