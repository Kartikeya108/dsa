class overloading {
void display(int a) {
System.out.println("Integer: " + a);
}

void display(String b) {
System.out.println("String: " + b);
}

void display(double c) {
System.out.println("Double: " + c);
}

public static void main(String[] args) {
overloading obj = new   overloading();
obj.display(10);
obj.display("Hello");
obj.display(3.14);
}
}
