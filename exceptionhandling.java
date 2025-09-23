import java.util.Scanner;
   public class exceptionhandling {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter " + n + " integers:");
try {
    for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
 
    for (int j = 0; j < i; j++) {
   
        if (arr[i] == arr[j]) {
 throw new Exception("Duplicate number found: " + arr[i]); }
    }
    }
    System.out.println("No duplicates.");
    } 
catch (Exception e) {
    System.out.println("Exception: " + e.getMessage());}
   
}
}