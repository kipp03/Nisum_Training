import java.util.Scanner; 
class UserProfile { 
String name; 
int age; 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter your name: "); 
String name = scanner.nextLine(); 
System.out.print("Enter your age: "); 
int age = scanner.nextInt(); 
UserProfile user = new UserProfile(); 
user.name = name; 
user.age = age; 
System.out.println("\nUser Profile:"); 
System.out.println("Name: " + user.name); 
System.out.println("Age: " + user.age); 
scanner.close(); 
}} 