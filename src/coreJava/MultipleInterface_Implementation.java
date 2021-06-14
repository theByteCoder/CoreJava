package coreJava;

interface one {
	public default void method() {
		System.out.println("one method");
	}
}

interface two {
	public default void method() {
		System.out.println("two method");
	}
}

public class MultipleInterface_Implementation implements one, two {

	public static void main(String[] args) {		
		MultipleInterface_Implementation obj = new MultipleInterface_Implementation();
		obj.method();
	}

	@Override
	public void method() {
		one.super.method();
		two.super.method();
	}

}
