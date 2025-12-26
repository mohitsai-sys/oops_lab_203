public class avg
{
public int findAvg( int numA, int numB, int numC)
{
return (numA+numB+numC)/3;
}
public static void main(String args[])
{
avg obj= new avg();
int avg = obj.findAvg(20,25,40);
System.out.println("The average of 20,25 and 40 is :" + avg);
}
}