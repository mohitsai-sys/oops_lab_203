class College {
protected String collegeName = "ABC Engineering College";
protected int totalStudents = 1200;
protected void displayDetails() {
System.out.println("College Name: " + collegeName);
System.out.println("Total Students: " + totalStudents);
}
}
public class Protected{
public static void main(String[] args) {
College c = new College();
System.out.println("College: " + c.collegeName);
System.out.println("Students: " + c.totalStudents);
c.displayDetails();
}
}