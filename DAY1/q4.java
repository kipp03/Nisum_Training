class Fruit { 
static String type; 
static { 
type = "Generic Fruit"; 
System.out.println("Static block "); 
} 
public static void main(String[] args) { 
System.out.println("Main method. Fruit type: " + Fruit.type); 
} 
}