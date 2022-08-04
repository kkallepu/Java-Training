package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {
    static final int MIN_AGE =18;
    static final double PI = 3.1412;
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for(String value : strings){
            System.out.println(value);
        }

        int[] numbers = {1,2,3,4,5};
        for (int a:numbers ) {
            System.out.println(a);

        }



    }
}
