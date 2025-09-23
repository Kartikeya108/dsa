abstract class animal {
    abstract void sound();
}
class dog extends Animal {
    void sound() {
              System.out.println("Dog barks");     
    }
}
class Animal {
    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
    }
}