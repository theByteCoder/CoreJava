package core;
public class SetVariableValue_FromMethod {

	static Object a;
	static int b = 0;
	
	public static void main(String[] args) {
			
		SetVariableValue_FromMethod obj = new SetVariableValue_FromMethod();
		
		Object c = obj.setNumber("Subhasish");
		System.out.println("Class variable "+a);
		System.out.println("Class variable "+b);
		System.out.println(c);
		System.out.println(obj.getNumber());
	}
	
	public Object getNumber() {
		return this.a;
	}
	
	public Object setNumber(Object a) {
		this.a = a;
		b = b + 1;
		System.out.println(b);
		return this.a;
	}

}
