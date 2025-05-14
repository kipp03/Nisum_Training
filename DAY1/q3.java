class Shape { 
public static void printArea() { 
System.out.println("method to calculate area."); 
} 
} 
class Circle extends Shape { 
public static void main(String[] args) { 
Circle.printArea();  
Shape.printArea(); 
}}