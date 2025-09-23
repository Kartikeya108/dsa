class Parent {
    void show() {
        System.out.println("Parent has a show method");
    }
}
    class Child extends Parent {
      @Override  void show() {
            System.out.println("Child has a show  method");
         }
    }
    public class overriding {
    public static void main(String[] args) {
       
        Parent p = new Child();
        p.show();
    }
}