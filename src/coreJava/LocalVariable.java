package coreJava;

public class LocalVariable {
	
	static int classVariable = 0;
	int instanceVariable = 0;
	
	public void variables() {
		
		int a = 1;
		int b = 2;
		int localVariable = 0;
		instanceVariable = a + b;
		
		System.out.println(localVariable);
		System.out.println(instanceVariable);
		System.out.println(classVariable);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classVariable = 10 + 2;
		LocalVariable obj = new LocalVariable();
		obj.variables();
	}

}
