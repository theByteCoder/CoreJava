package coreJava;

public class ObjectParameterMethod {

	public static void main(String[] args) {
		
		ObjectParameterMethod ob = new ObjectParameterMethod();
		ob.Abcd("10");
		}
	
	// Here instead of passing any data type as parameter, we pass object, return type is also object
	public Object Abcd(Object a) {
			String b = (String)a + "10";
			System.out.println(b);
			return b;
		}
	}
	