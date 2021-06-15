public class InheritanceOfClasses {
	
	public void nonStaticMethod1() {
	System.out.println("non Static Method");
	}
	
	static {
	System.out.println("static block");
	}
	
	public static void staticMethod1() {
	System.out.println("Static Method");
	}
	
	InheritanceOfClasses() {
		System.out.println("Constructor 1");
	}
	
	public static void main(String[] Abcd) {
		
	}
	 
}

 class Subhasish extends InheritanceOfClasses {
	 
	 int a = 0;
	 
	 Subhasish(){
		 System.out.println("Constructor of Subhasish");
	 }
	 
	 public void nonStaticMethod2() {
		 System.out.println("nonStaticMethod Subhasish");
	 }
	 
	 public static void main(String args[]) {
//	 InheritanceOfClasses obj2 = new InheritanceOfClasses();
	 Subhasish obj3 = new Subhasish();
//	 obj2.nonStaticMethod1();
	 obj3.nonStaticMethod1();
	 obj3.nonStaticMethod2();
	 }
}