package core;
import java.util.Scanner;

public class Encapsulation_GetterSetter {

	String name;
	
	public String getName() {
		return this.name;
	}
	
	public String setName(String name) {
	this.name = name;
	return name;	
	}
	
	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		String name = obj1.next();
		
		Encapsulation_GetterSetter obj2 = new Encapsulation_GetterSetter();
		obj2.setName(name);
		System.out.println(obj2.getName());
	}

}
