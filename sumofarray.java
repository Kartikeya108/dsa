
import java.util.*;

public class sumofarray { // Java program to find sum of array elements using tail recursion
    
    
    static int arraySum(int arr[], int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return arraySum(arr, n - 1, sum + arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = arraySum(arr, arr.length, 0);
        System.out.println("Sum of array elements = " + sum);
    }
}
