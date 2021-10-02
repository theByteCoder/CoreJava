package core;
import java.io.PrintStream;

class Methods {
	// Constructor method
	Methods() {
		System.out.println("Constructor method is called when an object of it's class is created");
	}

	// Main method where program execution begins
	public static void main(String[] args) {
		staticMethod();
		Methods object = new Methods();
		object.nonStaticMethod();
	}

	static PrintStream printerOUT = System.out, printerERR = System.err;;

	// Static method
	static void staticMethod() {
		printerOUT.println("Static method can be called without creating object");
		printerERR.println("Static method can be called without creating object");
	}

	// Non static method
	void nonStaticMethod() {
		System.out.println("Non static method must be called by creating an object");
	}
}