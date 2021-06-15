public class StringSplitReverseJoin {

	public static void main(String[] args) {
		// using string builder
		StringBuilder sbuilder = new StringBuilder("coding is great ");
		sbuilder.append("coding is great");
		sbuilder.reverse();
		System.out.println(sbuilder);

		// using string buffer
		StringBuffer sbuffer = new StringBuffer("coding is great");
		sbuffer.reverse();
		System.out.println(sbuffer);

		// using string
		String stringVal = "coding is great";
		String stringNewVal = "";
		String[] arr = stringVal.split("");
		for (int i = arr.length - 1; i >= 0; i--) {
			stringNewVal += arr[i];
		}
		System.out.println(stringNewVal);
	}
}
