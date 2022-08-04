package Day3;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,2,4,4,5,6};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]== numbers[j]){
                    System.out.println(" numbers array has duplicate elements" + numbers[i] + "," + numbers[j]);
//                    return;
                }
            }

        }


    }
}
