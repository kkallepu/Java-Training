package nz.co.tvnz.day5;

public class BankAccount1 {
    private int accNo;
    private float curBal;
    private static int idNum = 1000;
    public BankAccount1 () {
        accNo = idNum++;
        curBal = 0;
    }
    public static int getIdNum () {
        return idNum;
    }
    public static void main (String [ ] args) {
        System.out.println(BankAccount1.getIdNum());
        BankAccount1 ba = new BankAccount1 ();
        BankAccount1 ba1 = new BankAccount1 ();
        int a =BankAccount1.getIdNum();
        System.out.println(ba.accNo);
        System.out.println (ba1.accNo);

    }
}
