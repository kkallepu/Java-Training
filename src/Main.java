public class Main {
    public  String name= "Kiran Kallepu";
    int a=10, b, c;
    byte B=22;
    double pi = 3.14159;
    char A= 'a';
    String string="test";
    String string1 =  "string";
    public static void main(String[] args) {
        System.out.println("Hello world!");
       new Main().printMethod();
        new Main().print2();
    }

    public void printMethod(){

        System.out.println(string1);

    }
    public void print2(){
        System.out.println(string1);
        System.out.printf(string);
    }

}