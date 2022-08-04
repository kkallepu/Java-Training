package Day3;

public class RemoveDuplicates {

    public static int[] removeduplicates(int a[])
    {

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[a.length - 1];

        return temp;
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 1, 2, 2, 2 };


        int [] result = removeduplicates(a);

        // Printing The array elements
        for (int i = 0; i < result.length; i++)
            if(result[i]!=0) System.out.print(result[i] + " ");
    }
}

