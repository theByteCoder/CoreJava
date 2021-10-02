package core;
public class RunTimePolymorphism implements PolymorpInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTimePolymorphism obj = new RunTimePolymorphism();
		obj.abstractMethod();
	}

	@Override
	public void abstractMethod() { 
		// abstractMethod method is declared as an abstract method in PolymorpInterface interface
		// TODO Auto-generated method stub
		System.out.println("Runtime inheritance is example of method overriding");
	}

}
