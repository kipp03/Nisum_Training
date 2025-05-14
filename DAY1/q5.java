class Student { 
String name; 
String section; 
static String college; 
int rollNo; 
static { 
college = "XYZ College"; 
} 
public Student(String name, String section, int rollNo) { 
this.name = name; 
this.section = section; 
this.rollNo = rollNo; 
} 
public void displayInfo() { 
System.out.println("Name: " + name) 
System.out.println("Section: " + section); 
System.out.println("College: " + college); 
System.out.println("Roll No: " + rollNo); 
} 
public static void main(String[] args) { 
Student student1 = new Student("Samarth", "A", "10th"); 
Student student2 = new Student("Raj", "B", "10th"); 
student1.displayInfo(); 
System.out.println("\n"); 
student2.displayInfo(); 
} 
} 