package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.println(i + ", ");
            }


        }
        for (int i = 20; i >= 1; i--) {

            if (i % 5 == 0) {
                System.out.println(i + ", ");
            }

        }
        for (int i = 0; i <= 20; i+=2) {
            if (i % 2 == 0) {
                System.out.println(i + ", ");
            }


        }

        String [] vowels = {"a", "e", "i", "o", "u"};
        List<String> vowelsList = Arrays.asList(vowels);


        for (String a: vowelsList ) {
            System.out.println(a);

        }

    }
}