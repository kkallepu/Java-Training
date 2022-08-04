package Day4;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i =0;
        do {
            System.out.println("welcome to do loop");
            i++;
        }while (i==0);
        do {
            System.out.println("aa");
            i++;
            if(i==5) break;
        }while (true);
    }
}
