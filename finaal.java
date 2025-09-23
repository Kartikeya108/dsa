public class finaal {
  final int value;
    finaal(int v) {
        value = v;
    }
      final void display() {
        System.out.println("Final variable value = " + value);
    }
}
      final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}
 class FinalExample {
    public static void main(String[] args) {
        finaal obj = new finaal(100);
        obj.display();

        FinalClass fc = new FinalClass();
        fc.show();
    }
}

