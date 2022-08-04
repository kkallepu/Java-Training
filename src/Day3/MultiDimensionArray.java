package Day3;

import java.sql.Array;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int a[][] = {{1,2},{4,3}};
        int b[][] = {{1,2,3}, {4,5,6}};
        int c[][] = new int[2][2];
        int d[][] = new int [5][6];
        int e[][] = new  int [2][2];

        c[0][0] = 2;
        c[0][1] = 3;
        c[1][0]= 4;
        c[1][1] = 5;
        int k=10;
//        System.out.println(c[1][0]);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                e[i][j] = k;

            }

        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println( e[i][j]);

            }

        }

//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println(a[i][j]);
//
//            }
//
//        }
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(b[i][j]);
//            }
//
//        }


    }
}
