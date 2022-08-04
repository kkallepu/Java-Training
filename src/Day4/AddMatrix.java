package Day4;

public class AddMatrix {
    public static void main(String[] args) {
        int[][] matrix1 =new int[3][3];
        int[][] matrix2 =new int[3][3];
        int[][] matrix3 = new int[3][3];
        int k=10;
        for (int i = 0; i <=2 ; i++) {
            for (int j = 0; j <=2; j++) {
                matrix1[i][j] = k;
                matrix2[i][j] = k+2;
                k++;

            }

        }
        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <=2 ; j++) {
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];

            }

        }

        System.out.println("The Addition of 2 Matrix is ");
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.print(matrix3[i][j]+"\t");
            }
            System.out.println();
        }
    }


}
