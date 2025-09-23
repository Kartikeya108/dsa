public class Transposearray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

 
        
        int[][] transposedMatrix = new int[3][3];

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                transposedMatrix[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

