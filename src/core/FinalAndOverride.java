package core;
abstract class abstractClass {
	public abstract void func();
}

public class FinalAndOverride extends abstractClass {
	@Override
	public void func() {
		System.out.println("Test");
	}
	public static void main(String[] args) {
		abstractClass ac = new FinalAndOverride();
		ac.func();
	}
}