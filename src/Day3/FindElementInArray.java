package Day3;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,8,9,0,2};
        int numberToFind = 5;
        Boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==numberToFind){
                System.out.println("Given number is found in array : " + numberToFind);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Given number is not found in array : " + numberToFind);
        }

    }
}
