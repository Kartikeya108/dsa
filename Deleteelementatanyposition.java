public class B {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int pos = 2; // index to delete

        // Left shift elements from pos
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Last element set to 0
        arr[arr.length - 1] = 0;

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

