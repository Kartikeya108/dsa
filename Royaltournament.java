import java.util.*;

public class Royaltournament {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teams and players per team: ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        int winnerIndex = -1;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            System.out.print("Enter scores for team " + i + ": ");
            for (int j = 0; j < M; j++) {
                rowSum += sc.nextInt();
            }

            if (rowSum > maxSum) {
                maxSum = rowSum;
                winnerIndex = i;
            }
        }

        System.out.println("Winning Team Index: " + winnerIndex);

        sc.close();
    }
}
