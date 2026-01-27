import java.util.*;
public class Weather
{
public static void main(String[] args)
{
Scanner climate = new Scanner(System.in);
int temperature;
boolean run=true;
while (run)
{
System.out.print("Enter temperature in Celsius: ");
temperature = climate.nextInt();
if (temperature < 20)
{
System.out.println("Weather is cold. Wear warm clothes.");
}
else if (temperature >= 20 && temperature <= 30)
{
System.out.println("Weather is moderate.");
}
else
{
System.out.println("Weather is hot. Stay hydrated.");
}
run=climate.nextBoolean();          
}
}
}
