import java.util.Arrays;
import java.util.Collections;

public class inbuiltSortingTwo {

    public static void display(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Integer arrNew[] = { 5, 4, 1, 3, 2 };

        Arrays.sort(arr,Collections.reverseOrder()); // sorting in ascending order
        display(arr);

        Arrays.sort(arrNew, 0, 3,Collections.reverseOrder()); // sorting with indexing
        display(arrNew);

    }

}
