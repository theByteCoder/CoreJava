public class SetVariableValue {

	public static void main(String[] args) {
		
		SetVariableValue obj = new SetVariableValue();
		
		Object a = obj.value("Subhasish");
		System.out.println(a);
	}
	
	Object value(Object val) {
		System.out.println("Value gets printed on method call");
		return val;
	}

}
