import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2};
        int size = arr.length;

        int[] arrr = new int[10];
        for (int i = 0; i < size; i++) {
            arrr[i] = arr[i];
        }

        int pos = 2;
        int value = 3;

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position!");
        } else {
            for (int i = size; i > pos; i--) {
                arrr[i] = arrr[i - 1];
            }
            arrr[pos] = value;
            size++;
        }

        System.out.println("After inserting " + value + " at index " + pos + ": " + Arrays.toString(Arrays.copyOf(arrr, size)));
    }
}
