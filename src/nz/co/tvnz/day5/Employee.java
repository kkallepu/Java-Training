package nz.co.tvnz.day5;

class Employee {
    String name;
    Employee (String name){
        this.name = name;

    }
    protected void finalize () {
        System.out.println ("\t\tFinalizing...");
    }

    public String toString(){
        return  "this is a toString method";

    }
}