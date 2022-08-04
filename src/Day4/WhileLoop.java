package Day4;

public class WhileLoop {
    public static void main(String[] args) {
        int i=0;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        int j=0;
        while (true){
            System.out.println(j);
            j++;
            if(j>10) break;
        }
//        while (true){
//            System.out.println("aaa");
//        }
    }
}
