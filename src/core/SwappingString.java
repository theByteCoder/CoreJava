package core;
import java.util.Scanner;

public class SwappingString {
	
	public static void main(String[] arguments) {
		
		Scanner scan = new Scanner(System.in);
				
//		Using temporary variable
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c;
		c = b;
		b = a;
		a = c;
		System.out.println(a);
		System.out.println(b);
		
		scan.close();		
	}

}
