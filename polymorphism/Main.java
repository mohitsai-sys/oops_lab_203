class AreaCalculator {
int area(int side) {
return side * side;
}
int area(int length, int breadth) {
return length * breadth;
}
double area(double radius) {
return 3.14 * radius * radius;
}
}
public class Main {
public static void main(String[] args) {
AreaCalculator calc = new AreaCalculator();
System.out.println("Area of Square: " + calc.area(4));
System.out.println("Area of Rectangle: " + calc.area(5, 3));
System.out.println("Area of Circle: " + calc.area(2.5));
}
}