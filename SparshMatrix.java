public class SparshMatrix {
    public static void main(String[] args) {
        int zero = 0;
        int nonzero = 0;
        int[][] arr = {
            {0, 0, 3},
            {4, 0, 0},
            {0, 0, 5}
        };
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    zero++;
                } else {
                    nonzero++;
                }
            }
        }
        
        if (zero > nonzero) {
            System.out.println("sparse matrix");
        } else {
            System.out.println("not a sparse matrix");
        }
        
        int[][] sparsh = new int[nonzero][3];
        int k = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    sparsh[k][0] = i;
                    sparsh[k][1] = j;
                    sparsh[k][2] = arr[i][j];
                    k++;
                }
            }
        }
       System.out.println("Sparse Array (Row, Column, Value):");
        for (int i = 0; i < nonzero; i++) {
            System.out.println(sparsh[i][0] + " " + sparsh[i][1] + " " + sparsh[i][2]);
        }
    }
}
    