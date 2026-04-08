final class Library {
private String bookName;
private int bookId;
private boolean isIssued;
private int issueDays;
public void addBook(String name, int id) {
bookName = name;
bookId = id;
isIssued = false;
issueDays = 0;
System.out.println("Book added successfully.");
}
public void issueBook(int days) {
if (isIssued) {
System.out.println("Book is already issued!");
} else {
if (days > 0) {
isIssued = true;
issueDays = days;
System.out.println("Book issued for " + days + " days.");
} else {
System.out.println("Invalid number of days!");
}
}
}
public void returnBook() {
if (!isIssued) {
System.out.println("Book was not issued.");
} else {
System.out.println("Book returned successfully.");
calculateFine();
isIssued = false;
issueDays = 0;
}
}
public void calculateFine() {
int fine = 0;
if (issueDays > 7) {
fine = (issueDays - 7) * 10;
System.out.println("Late return! Fine: " + fine);
} else {
System.out.println("No fine.");
}
}
public void displayBookDetails() {
System.out.println("\nBook Name: " + bookName);
System.out.println("Book ID: " + bookId);
System.out.println("Issued: " + isIssued);
System.out.println("Issue Days: " + issueDays);
}
}
public class Finalc {
public static void main(String[] args) {
Library lib = new Library();
lib.addBook("Java Programming", 101);
lib.displayBookDetails();
lib.issueBook(10);
lib.displayBookDetails();
lib.returnBook();
lib.displayBookDetails();
}
}