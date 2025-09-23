import java.util.*;
public class towerofhonoi {
    static int  count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        System.out.println("The sequence of moves involved in the Tower of Hanoi are:");
        towerOfHanoi(n, 'A', 'C', 'B');
        System.out.println("Total moves: " + count);
        sc.close();
    }

    static void towerOfHanoi(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + target);
            count++;
            return;
        }
        towerOfHanoi(n - 1, source, auxiliary, target);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + target);
       
        count++;
        towerOfHanoi(n - 1, auxiliary, target, source);
    }
}