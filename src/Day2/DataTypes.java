package Day2;

public class DataTypes {
    Boolean one = false;// Its value-range is true or false
    byte a = -128; //Its value-range lies between -128 to 127
    short c = 10000;  //Its value-range lies between -32,768 to 32,767 (inclusive)
    int i = 10000;//Its minimum value is - 2,147,483,648 and maximum value is 2,147,483,647.
    long l = 2000;// 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807.
    float f = 2.0f;
    double d = 12.34234352346645656765756;
    char letterA = 'A';

    public static void main(String[] args) {
        int a =10;
        float f =a;
        System.out.println(a);
        System.out.println(f);
        float f1 =10.5f;
//        int b = f1;
        int b = (int)f1;
        System.out.println(f1);
        System.out.println(b);
        byte aa= 100;
        byte bb =100;
        byte cc = (byte) (aa+bb);
        System.out.println(cc);
    }

}
