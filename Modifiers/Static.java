class MathUtility {
public static int add(int a, int b) {
return a + b;
}
public static int findMax(int a, int b, int c) {
int max = a;
if (b > max) {
max = b;
}
if (c > max) {
max = c;
}
return max;
}
public static void checkEvenOdd(int num) {
if (num % 2 == 0) {
System.out.println(num + " is Even");
} else {
System.out.println(num + " is Odd");
}
}
public static int factorial(int n) {
int fact = 1;
for (int i = 1; i <= n; i++) {
fact = fact * i;
}
return fact;
}
public static void printTable(int n) {
System.out.println("\nMultiplication Table of " + n);
for (int i = 1; i <= 10; i++) {
System.out.println(n + " x " + i + " = " + (n * i));
}
}
}
public class Static {
public static void main(String[] args) {
int sum = MathUtility.add(10, 20);
System.out.println("Sum: " + sum);
int max = MathUtility.findMax(15, 40, 25);
System.out.println("Maximum: " + max);
MathUtility.checkEvenOdd(7);
int fact = MathUtility.factorial(5);
System.out.println("Factorial: " + fact);
MathUtility.printTable(6);
}
}