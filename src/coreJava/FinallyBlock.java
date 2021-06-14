package coreJava;

public class FinallyBlock {

	static int num1 = 1;
	static int num2 = 0;
	static int num3;
	
	public static void main(String[] args) {
		
		try {
			num3 = num1/num2;
			System.out.println(num3);
		}
		catch (Exception e) {
			System.out.println(e);
			return;
		}
		finally {
			System.out.println("Finally block gets executed anyway");
		}

	}

}
