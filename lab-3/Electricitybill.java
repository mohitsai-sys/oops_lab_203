import java.util.*;
public class Electricitybill
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
int units;
double bill;
Boolean loop=true;
do
{
System.out.print("Enter electricity units consumed: ");
units = scanner.nextInt();
if (units <= 100)
{
bill = units * 1.5;
System.out.println("Low usage category");
}
else if (units <= 300)
{
bill = units * 2.5;
System.out.println("Medium usage category");
}
else
{
bill = units * 4.0;
System.out.println("High usage category");
}
System.out.println("Total bill amount:" + bill);
loop = scanner.nextBoolean();
}
while(loop);
}
}
