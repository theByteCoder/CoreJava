package core;
import java.util.Scanner;

public class SwappingNumbers {
	
	public static void main(String[] arguments) {
		
		Scanner scan = new Scanner(System.in);
				
//		Using temporary variable
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c;
		c = b;
		b = a;
		a = c;
		System.out.println(a);
		System.out.println(b);
		
//		Without Using temporary variable
		int x = scan.nextInt();
		int y = scan.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x);
		System.out.println(y);	
		
		scan.close();		
	}

}
