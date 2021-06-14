package coreJava;

public class StaticKeyword {

	static int val = setVal();

	static {
		System.out.println("Static block");
	}

	int new_val = setVal();

	public static int setVal() {
		System.out.println("Static method");
		return 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(val);
		System.out.println("Main method");
		System.out.println(new StaticKeyword().new_val + 10);

	}

}
