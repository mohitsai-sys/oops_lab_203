class Person {
String name;
int age;
Person(String name, int age) {
this.name = name;
this.age = age;
}
void displayPerson() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}
class Student extends Person {
int marks;
Student(String name, int age, int marks) {
super(name, age);
this.marks = marks;
}
void displayStudent() {
System.out.println("Marks: " + marks);
if (marks >= 50) {
System.out.println("Result: Pass");
} else 
{
System.out.println("Result: Fail");
}
}
}
class Teacher extends Person {
double salary;
Teacher(String name, int age, double salary) {
super(name, age);
this.salary = salary;
}
void displayTeacher() {
System.out.println("Salary: " + salary);
double annual = salary * 12;
System.out.println("Annual Salary: " + annual);
}
}
class Staff extends Person {
String department;
Staff(String name, int age, String dept) {
super(name, age);
this.department = dept;
}
void displayStaff() {
System.out.println("Department: " + department);
}
}
public class inheretance {
public static void main(String[] args) {
System.out.println("---- Student Info ----");
Student s = new Student("Mohit", 20, 75);
s.displayPerson();
s.displayStudent();
System.out.println("\n---- Teacher Info ----");
Teacher t = new Teacher("Ravi", 40, 50000);
t.displayPerson();
t.displayTeacher();
System.out.println("\n---- Staff Info ----");
Staff st = new Staff("Anil", 35, "Admin");
st.displayPerson();
st.displayStaff();
}
}