import java.util.Arrays;

public class removeSpecificElement {
    public static void main(String[] args) {
    int[] a = {2, 90, 56, 44, 36, 83, 77, 65, 29, 4};

    System.out.println("Original Array : " + Arrays.toString(a));

    // Remove the second element (index->1, value->14) of the array
            int removeIndex = 6;

            for (int i = removeIndex; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
            System.out.println("After removing the element: " + Arrays.toString(a));
        }

    }
