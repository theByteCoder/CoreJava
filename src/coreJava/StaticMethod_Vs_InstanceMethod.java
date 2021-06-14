package coreJava;

public class StaticMethod_Vs_InstanceMethod {

	public static void main(String[] args) {

		methodTypes.staticMethod();
		methodTypes obj = new methodTypes();
		obj.instanceMethod();

	}

}

class methodTypes {
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}
	
	public void instanceMethod() {
		System.out.println("Instance Method");	
	}
	
	public static void main(String arguments[]) {
		staticMethod();
	}
}