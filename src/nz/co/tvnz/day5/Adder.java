package nz.co.tvnz.day5;

public class Adder {
    int add (int a, int b){
        return a+b;
    }
    double add (double a, double b){
        return  a+b;
    }
    int add(int... y){
        int total =0;
        for (int a:y ) {
           total+=a ;
        }
        return total;
    }
}
