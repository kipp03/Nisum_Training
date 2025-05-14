class House { 
String color = "White"; 
public static void printDefaultColor() { 
System.out.println("Static method cannot directly access instance variable."); 
} 
public static void main(String[] args) { 
House.printDefaultColor(); 
House myHouse = new House(); 
System.out.println("My house color: " + myHouse.color); 
} 
}