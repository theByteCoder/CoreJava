public class InitializerBlock {

	static int val;

	// initializer
	{
		System.out.println("Initializer block");
		val = 1;
	}

	// constructor
	public InitializerBlock() {
		System.out.println("Constructor block");
	}

	// static method call
	static int newVal = returnInt();
	// static block
	static {
		System.out.println("Static block");
	}

	// static method
	static int returnInt() {
		System.out.println("Static method");
		return 22;
	}

	public static void main(String[] args) {
		new InitializerBlock(); // constructor call
		// static value calls
		System.out.println(val);
		System.out.println(newVal);
	}

}
