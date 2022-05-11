public class commonElement {
    public static void main(String[] args) {
    //Initialize array
    int [] a = new int [] {1, 8, 3, 5, 2, 7, 8, 1, 3};
    System.out.println("Common elements in given array: ");
    //Searches for duplicate element
    for(int i = 0; i < a.length; i++) {
    for(int j = i + 1; j < a.length; j++) {
    if(a[i] == a[j])
    System.out.println(a[j]);
    }
    }
    }
}
