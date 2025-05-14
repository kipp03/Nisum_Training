class Nisum { 
String companyName = "Nisum"; 
String location = "USA"; 
} 
class Employee extends Nisum { 
String employeeName; 
int employeeId; 
public Employee(String employeeName, int employeeId) { 
this.employeeName = employeeName; 
this.employeeId = employeeId; 
} 
public void displayEmployeeDetails() { 
System.out.println("Employee Name: " + employeeName); 
System.out.println("Employee ID: " + employeeId); 
System.out.println("Company Name: " + companyName); 
System.out.println("Location: " + location); 
} 
public static void main(String[] args) { 
Employee emp = new Employee("John Doe", 12345); 
emp.displayEmployeeDetails(); 
} 
}