
    interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

interface Interface3 {
    void method3();
}

class ParentClass {
    void parentMethod() {
        System.out.println("Parent class method");
    }
}

class ChildClass extends ParentClass implements Interface1, Interface2, Interface3 {
    public void method1() {
        System.out.println("Interface1 method implemented");
    }

    public void method2() {
        System.out.println("Interface2 method implemented");
    }

    public void method3() {
        System.out.println("Interface3 method implemented");
    }
}
public class Example {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.parentMethod();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
