//Java program to demonstrate positional access operations on List interface
package core;
import java.util.ArrayList;

public class Collections_ArrayList {
	public static void main(String args[]) {
		/*
		 * Creation of ArrayList: I'm going to add String elements so I made it of
		 * string type
		 */

		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> obj = new ArrayList<Comparable>();

		/* This is how elements should be added to the array list */
		obj.add("Ajeet");
		obj.add(1);
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		/* Displaying array list elements */
		System.out.println(obj);

		/* Add element at the given index */
		obj.add(0, "Rahul");
		obj.add(1, "Justin");
		System.out.println(obj);

		/* Remove elements from array list like this */
		obj.remove("Chaitanya");
		obj.remove("Anuj");
		System.out.println(obj);

		// Set is used update a position value
		obj.set(0, "Piyu");
		System.out.println(obj);

		// Get returns the object of list which is present at the specified index.
		String StringAtIndex = (String) obj.get(4);
		System.out.println("Element at index is: " + StringAtIndex);

		// Size gives the size of the ArrayList � Number of elements of the list.
		int numberofitems = obj.size();
		System.out.println("Number of items is : " + numberofitems);

		// Contains returns true if the string �Steve� is present in the list else we
		// would get false.
		System.out.println(obj.contains("Piyu"));

		/* Remove element from the given index */
		obj.remove(1);
		System.out.println(obj);

		// Clear is used for removing all the elements of the array list in one go.
		obj.clear();
		System.out.println(obj);
	}
}