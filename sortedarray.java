public class sortedarray {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50}; 

        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("Array is sorted ");//array is sorted if it is in ascending order or descending order
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}

    
