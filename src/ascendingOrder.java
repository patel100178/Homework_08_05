public class ascendingOrder {
    public static void main(String[] args) {
        //Initialize array
        int[] a = new int[]{7, 5, 4, 3, 1};
        int b = 0;

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
        }

        //Sort the array in ascending order
        for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
        b = a[i];
        a[i] = a[j];
        a[j] = b;
        }
        }
        }
        System.out.println();

       //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
        }
    }
}
