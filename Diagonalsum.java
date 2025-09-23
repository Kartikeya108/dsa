import java.util.Scanner;

public class Diagonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the chessboard (N): ");
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        System.out.println("Enter the elements of the matrix row by row:");
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print("Element at row " + (i+1) + ", column " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        for(int i = 0; i < N; i++) {
            mainDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][N-1-i];
        }

        System.out.println("Sum of the main diagonal: " + mainDiagonal);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonal);
    }
}
