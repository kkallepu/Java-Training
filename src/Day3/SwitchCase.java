package Day3;

public class SwitchCase {
    public static void main(String[] args) {
        int a=20;
        switch (a){
            case 10:
                System.out.println(squre(a));
                break;
            case  20:
                int b =30;
                System.out.println(squre(b));
                break;
            default:
                System.out.println("No Match found");

        }
    }
    public static int squre(int a){
        return a * a;
    }
}
