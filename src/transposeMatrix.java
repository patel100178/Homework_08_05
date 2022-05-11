public class transposeMatrix {
    public static void main(String[] args) {
    //create a matrix
    int a[][]={{1,3,4},{2,4,3},{3,4,5}};
    //create transpose matrix
    int b[][]=new int[3][3];// 3 rows and 3 columns
    //Code to transpose a matrix
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    b[i][j]=a[j][i];
    }
    }
    System.out.println("Printing Matrix without transpose:");
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    System.out.print(a[i][j]+" ");
    }
    System.out.println();//new line
    }
    System.out.println("Printing Matrix After Transpose:");
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    System.out.print(b[i][j]+" ");
    }
    System.out.println();//new line
    }
}

 }

