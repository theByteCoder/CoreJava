package core;
public class Constructor {

	static String a = "", b = "";

	Constructor() {
		this.a = "Coding is ";
		this.b = "great";
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println(a + b);
	}

}
