class Person {
String name = "Mohit";
void displayInfo() {
System.out.println("Name: " + name);
}
}
class Student extends Person {
int rollNo = 101;
void displayStudent() {
System.out.println("Roll Number: " + rollNo);
}
}
public class Sinheretance {
public static void main(String[] args) {
Student s = new Student();
s.displayInfo();
s.displayStudent();
}
}