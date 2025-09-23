abstract class shape {
abstract int area();
}

class Rectangle extends Shape {
int length = 10;
int breadth = 20;

int area() {
   return length * breadth;  
}
}

public class Shape {
public static void main(String[] args) {
Rectangle r = new Rectangle();
System.out.println("Area of Rectangle: " + r.area());
}
}
