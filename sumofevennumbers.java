import java.util.*;
public class sumofevennumbers { 
     int arraySum(int arr[]) {
        int sum = 0;   
        for(int i = 0; i < arr.length; i++) {
             if(arr[i] % 2 == 0){
            sum = sum + arr[i];  
        }
    }
         return sum;   }
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter size of array:");
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        System.out.println("Enter array elements:");   
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();   
        }
        sumofevennumbers obj = new sumofevennumbers();
        int sum = obj.arraySum(arr);
        System.out.println("Sum of array elements = " + sum);
        sc.close();   
     }}