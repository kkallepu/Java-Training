package Day3;

public class FindOddNumbers {
    public static void main(String[] args) {
        int b [] = {1,2,3,4,5,6,7,8,9};
        boolean flag = false;
        for (int i = 0; i < b.length; i++) {
            if(b[i]%2 == 1){
                System.out.print(b[i]+ ", ");
                flag = true;
            }

        }
        if (!flag){
            System.out.println(" No odd numbers found in given array");
        }
    }
}
