class Student {
private String name;
private int marks;
public void setDetails(String n, int m) {
name = n;
marks = m;
}
public void displayResult() {
System.out.println("Name: " + name);
System.out.println("Marks: " + marks);
if (marks >= 40) {
System.out.println("Result: Pass");
} else {
System.out.println("Result: Fail");
}
}
public void updateMarks(int newMarks) {
if (newMarks >= 0 && newMarks <= 100) {
marks = newMarks;
} else {
System.out.println("Invalid marks!");
}
}
}
public class Private {
public static void main(String[] args) {
Student s1 = new Student();
s1.setDetails("Mohit", 35);
s1.displayResult();
System.out.println("\nUpdating marks...\n");
s1.updateMarks(75);
s1.displayResult();
}
}