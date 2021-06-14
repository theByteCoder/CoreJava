package coreJava;

public class OverloadingConstructor {
	
	OverloadingConstructor(int age){
		System.out.println(age);
	}
	
	OverloadingConstructor(String name){
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingConstructor obj = new OverloadingConstructor("Subhasish");
	}

}
