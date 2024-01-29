import java.util.Arrays;

public class inbuiltSortingOne {

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int arrNew[] = { 5, 4, 1, 3, 2 };

        Arrays.sort(arr); // sorting in ascending order
        display(arr);

        Arrays.sort(arrNew, 0, 3); // sorting with indexing
        display(arrNew);

    }

}
