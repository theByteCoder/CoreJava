package coreJava;
	
	interface MyInterface
	{
	   /* compiler will treat them as: 
	    * public abstract void method1();
	    * public abstract void method2();
	    */
	   public void method1();  // Declares abstract method
	   public void method2();  // Declares abstract method
	}
	class InterfaceImplement implements MyInterface
	{		
	   /* This class must have to implement both the abstract methods
	    * else you will get compilation error
	    */
	public void method1() 
	   {
		System.out.println("implementation of method1");
		   /* Implementation of abstract method1 in class
		 */		
	   }
	   
	   public void method2()
	   {
		System.out.println("implementation of method2");
		   /* Implementation of abstract method2 in class
		 */	
	   }
	   
	   public static void main(String arg[])
	   {
		MyInterface obj = new InterfaceImplement();
		obj.method1();
		obj.method2();
	   }
}