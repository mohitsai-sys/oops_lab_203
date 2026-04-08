abstract class Shape {
protected double value1;
protected double value2;
public void setValues(double v1, double v2) {
value1 = v1;
value2 = v2;
}
abstract void calculateArea();
public static void displayMessage() {
System.out.println("\n--- Shape Area Calculator ---");
}
public static boolean isValid(double v) {
if (v > 0) {
return true;
} else {
return false;
}
}
}
class Rectangle extends Shape {
void calculateArea() {
if (Shape.isValid(value1) && Shape.isValid(value2)) {
double area = value1 * value2;
System.out.println("Rectangle Area: " + area);
} else {
System.out.println("Invalid dimensions for Rectangle!");
}
}
}
class Triangle extends Shape {
void calculateArea() {
if (Shape.isValid(value1) && Shape.isValid(value2)) {
double area = 0.5 * value1 * value2;
System.out.println("Triangle Area: " + area);
} else {
System.out.println("Invalid dimensions for Triangle!");
}
}
}
class Circle extends Shape {
void calculateArea() {
if (Shape.isValid(value1)) {
double area = 3.14 * value1 * value1;
System.out.println("Circle Area: " + area);
} else {
System.out.println("Invalid radius!");
}
}
}
public class Abstract {
    public static void main(String[] args) {

        Shape.displayMessage(); // calling static method

        Rectangle r = new Rectangle();
        r.setValues(10, 5);
        r.calculateArea();

        Triangle t = new Triangle();
        t.setValues(6, 4);
        t.calculateArea();

        Circle c = new Circle();
        c.setValues(7, 0); // second value not used
        c.calculateArea();
    }
}