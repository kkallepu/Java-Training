package nz.co.tvnz.day5;

public class BankAccount {
    public BankAccount(int id, float curBal, String name) {
        this.id = new BankAccount(id).id;
        this.curBal = curBal;
        this.name = name;
    }

    private BankAccount(int id){
        this.id = 200 + id;
    }


    private int id;
    private float curBal=0;
    private String  name;

    void deposit (float amt) {
       curBal += amt;
    }

    void withdraw (float amt) {
        curBal -= amt;
    }

    float getCurBal(){
        return curBal;
    }

    public int getId() {
        return this.id;
    }

}
