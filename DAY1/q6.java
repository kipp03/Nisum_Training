class Calculator { 
public static int add(int a, int b) { 
return a + b; 
} 
public static double add(double a, double b) { 
return a + b; 
} 
public static void main(String[] args) { 
int sumInt = Calculator.add(5, 3); 
double sumDouble = Calculator.add(2.5, 3.5); 
System.out.println("Sum of integers: " + sumInt); 
System.out.println("Sum of doubles: " + sumDouble); 
} 
} 