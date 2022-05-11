public class multiplicationWhileLoop {

    public static void main(String[] args) {
        int MulTable[][] = new int[10][10];
        int row = 1, column = 1;
        for (int a = 0; a < MulTable.length; a++ ){
        for (int b = 0; b < MulTable[a].length; b++){
        MulTable[a][b] = row * column;
        column = column +1;
        }
        row = row +1;
        column = 1;
        }
        for (int a = 0; a < MulTable.length; a++ ){
        for (int b = 0; b < MulTable[a].length; b++){
        System.out.print(" " + MulTable[a][b] + "\t| ");
        }
        System.out.print("\n");
        }


    }
    }
