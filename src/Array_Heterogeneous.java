public class Array_Heterogeneous {

	public static void main(String[] args) {
		
		Object value[] = new Object[10];
		
		value[0] = 10;
		value[1] = "Subhasish";
		value[2] = true;
		value[3] = 1.23;
				
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		System.out.println(value[3]);
		System.out.println(value.length);
	}

}
