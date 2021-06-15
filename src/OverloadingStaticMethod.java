public class OverloadingStaticMethod {

		 static void Sum(int i, int j) {
		  System.out.println(i + j);
		 }

		 static void Sum(int i, int j, int k) {
		  System.out.println(i + j + k);
		 }

		 public static void main(String args[]) {
		  Sum(10, 10, 10); //It will call Sum(int i, int j, int k)
		  Sum(20, 20);//It will call Sum(int i, int j)		  
		 }
}
