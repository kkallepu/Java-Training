package Day3;

public class NestedIfStatment {
    public static void main(String[] args) {
        boolean test =true;
        int age =20;
        int weight = 40;
        if(age>=18){
            if(weight>50){
                if("Kiran".equals("Kiran")) {
                    if(!test) {
                        System.out.println(" welcome to the group");
                    } else {
                        System.out.println("I am bool");
                    }
                }else {
                    System.out.println("I am String");
                }

            }else {
                System.out.println( " I am Int");
            }
        }
    }
}
