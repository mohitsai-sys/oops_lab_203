class Employee {
String name;
int empId;
Employee(String name, int empId) {
this.name = name;
this.empId = empId;
}
void displayEmployee() {
System.out.println("Name: " + name);
System.out.println("Employee ID: " + empId);
}
}
class Developer extends Employee {
String programmingLanguage;
double baseSalary;
Developer(String name, int empId, String lang, double salary) {
super(name, empId);
this.programmingLanguage = lang;
this.baseSalary = salary;
}
void displayDeveloper() {
System.out.println("Language: " + programmingLanguage);
System.out.println("Base Salary: " + baseSalary);
}
}
class SeniorDeveloper extends Developer {
double bonus;
SeniorDeveloper(String name, int empId, String lang, double salary, double bonus) {
super(name, empId, lang, salary);
}
void calculateTotalSalary() {
double total = baseSalary + bonus;
System.out.println("Bonus: " + bonus);
System.out.println("Total Salary: " + total);
}
}
public class Minheretance {
public static void main(String[] args) {
SeniorDeveloper sd = new SeniorDeveloper("Mohit", 101, "Java", 60000, 10000);
System.out.println("\n--- Employee Details ---");
sd.displayEmployee();
System.out.println("\n--- Developer Details ---");
sd.displayDeveloper();
System.out.println("\n--- Senior Developer Details ---");
sd.calculateTotalSalary();
}
}