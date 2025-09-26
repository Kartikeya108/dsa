import java.util.*;
public class Quicksort {
    static class Solution {
        public void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }
           private int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;       

            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
               
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        sol.quickSort(arr, 0, n - 1);
        System.out.println("Sorted Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
