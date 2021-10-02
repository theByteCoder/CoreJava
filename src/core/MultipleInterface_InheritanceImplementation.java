package core;
interface Animal {
	public static void bird() {
		System.out.println("Bird is an animal");
	}
}

interface School {
	public void student();
}

public class MultipleInterface_InheritanceImplementation implements Animal, School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal.bird();
		School obj = new MultipleInterface_InheritanceImplementation();
		obj.student();
		
	}

	@Override
	public void student() {
			System.out.println("Subahsish is a student");	
	}

}
