public class maxMinValue {
    public static void main(String[] args) {
        int[] a = {25, 78, 89, 92};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum element of Array " + max);

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum element of Array " + min);

    }
    }