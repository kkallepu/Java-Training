package Day3;

public class ConditionalStatements {


    public static void main(String[] args) {
        int b [] = {1,2,3,4,5,6,7,8,9};
        int a[] = {1,2,5,7,9 ,11};
        boolean flag = false;
        for (int i = 0; i < a.length ; i++) {
            if(a[i]%2==0){
                System.out.print(a[i]+", ");
              flag = true;
            } else if (a[i] == 4) {
                System.out.println("a[i] is equal to 4");


            } else{
                System.out.println(" No even number found in given array");
            }

        }

    }

}
