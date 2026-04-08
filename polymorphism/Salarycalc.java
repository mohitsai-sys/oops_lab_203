import java.util.Scanner;
class Salary {
double calculate(double basic) {
return basic;
    }
double calculate(double basic, double bonus) {
return basic + bonus;
}
double calculate(double basic, double bonus, double tax) {
return basic + bonus - tax;
}
}
public class Salarycalc {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Salary obj = new Salary();
System.out.println("Choose option:");
System.out.println("1. Basic Salary");
System.out.println("2. Salary with Bonus");
System.out.println("3. Salary with Bonus and Tax");
int choice = sc.nextInt();
switch (choice) {
case 1:
System.out.print("Enter basic salary: ");
double basic = sc.nextDouble();
System.out.println("Total Salary: " + obj.calculate(basic));
break;
case 2:
System.out.print("Enter basic salary and bonus: ");
double b1 = sc.nextDouble();
double bonus = sc.nextDouble();
System.out.println("Total Salary: " + obj.calculate(b1, bonus));
break;
case 3:
System.out.print("Enter basic salary, bonus, and tax: ");
double b2 = sc.nextDouble();
double bon = sc.nextDouble();
double tax = sc.nextDouble();
System.out.println("Total Salary: " + obj.calculate(b2, bon, tax));
break;
default:
System.out.println("Invalid choice!");
}
sc.close();
}
}