import java.util.*;
public class Canteenmenu
{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("Canteen Menu:");
System.out.println("1. Tea");
System.out.println("2. Coffee");
System.out.println("3. Snacks");
System.out.print("Enter your choice: ");
int choice = scan.nextInt();
for (int i = 1; i <= 1; i++)
{    
switch (choice)
{
case 1:
System.out.println("You selected Tea");
break;
case 2:
System.out.println("You selected Coffee");
break;
case 3:
System.out.println("You selected Snacks");
break;
default:
System.out.println("Invalid choice");
}
}
}
}
