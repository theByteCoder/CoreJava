import java.util.Scanner;

public class Encapsulation_GetterSetter_Implementation {
	
	public String value;
	
	public String getValue() {
		System.out.println(value);
		return this.value;
	}
	
	public String setValue(String value) {
		this.value = value;
		return value;
	}

	public static void main(String[] args) {

		Scanner obj1 = new Scanner(System.in);
		String value = obj1.nextLine();
		
		Encapsulation_GetterSetter_Implementation obj2 = new Encapsulation_GetterSetter_Implementation();
		obj2.setValue(value);
		obj2.getValue();
	}
}
