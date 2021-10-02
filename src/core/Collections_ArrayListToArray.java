package core;
import java.util.List;
import java.util.ArrayList;

class Collections_ArrayListToArray
{
 public static void main (String[] args)
 {
	 
	 List<Object> al = new ArrayList<Object>();
     al.add(10);
     al.add(20);
     al.add(30);
     al.add(40);

     // Create an array with length of the ArrayList
     Integer[] arr = new Integer[al.size()];

     // ArrayList to Array Conversion
     for (int i =0; i < al.size(); i++)
         arr[i] = (Integer) al.get(i);

     for (Integer x : arr)
         System.out.print(x + " ");
 }
}