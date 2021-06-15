import java.util.Scanner;

interface intF{	
	public void interfaceMethod();  // Declares abstract method in interface
}

abstract class Base implements intF {
   
	public abstract void fun(); // Declares abstract method in abstract class
   
	//	Implement abstract method from interface in abstract class
	public void interfaceMethod() {
	   System.out.println("Interface implmented in abstract class");
   }		
	  public void main(String s) {
		  	System.out.println("Multiple main method with string " + s);
		  }
}
class Derived extends Base {
  public void fun() {
    	System.out.println("Derived fun() called"); // Implements abstract method from abstract class
    	}
}
class SimpleAbstractClass {
    public static void main(String[] arguments) { 
     
    	Scanner scan = new Scanner(System.in);
    	int integer = scan.nextInt();
    	String string = scan.next();
    	main(integer);
        // Removing the following comment line will cause compiler error as the line tries to create an instance of abstract class.
        // Base b = new Base();
         // We can have references of Base type.
        Base obj1 = new Derived();
        obj1.fun(); 
        obj1.interfaceMethod();
        obj1.main(string);
        scan.close();
    }
    
    static void main(int i) {
    	System.out.println("Multiple main method with integer " + i);
    }
}