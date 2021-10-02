package core;
import java.util.ArrayList;
import java.util.List;

public class Collections_ListImplementation {

	public static void main(String[] args) {

		List list = new ArrayList<>();
		list.add("Test");
		list.add(1);
		System.out.println(list);
		
		ArrayList<Object> obj = new ArrayList<Object>();
		
		obj.add(0, "Subhasish");
		obj.add(1, "Piyu");
		
		System.out.println(obj.get(1));
		
		String[] listValues = new String[obj.size()];
		
		for(int i=0; i<obj.size(); i++) {
			listValues[i] = (String) obj.get(i);
			System.out.println(listValues[i]);
		}
	}

}
