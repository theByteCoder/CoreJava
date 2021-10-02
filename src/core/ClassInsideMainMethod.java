package core;
public class ClassInsideMainMethod {
	
	public static void main(String[] args) {

		class inner_Class {			
			void sysout() {
				System.out.println("Class inside main method");
			}
		}
		
		new inner_Class().sysout();
	}
}