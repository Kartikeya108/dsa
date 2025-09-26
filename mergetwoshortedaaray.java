import java.util.*;
public class mergetwoshortedaaray {
    static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                list.add(list1.get(i++));
            } else {
                list.add(list2.get(j++));
            }
        }

        while (i < list1.size()) list.add(list1.get(i++));
        while (j < list2.size()) list.add(list2.get(j++));

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter size of first sorted list: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of first sorted list:");
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }

        System.out.print("Enter size of second sorted list: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of second sorted list:");
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }

        ArrayList<Integer> list = merge(list1, list2);
        System.out.println("Merged sorted list: " + list);
    }


    
}
