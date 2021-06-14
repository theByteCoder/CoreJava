package coreJava;

class ReverseString
{
   public static void main(String args[])
   {
	   reverseStringBuffer(); // Static method does not require object to be invoked
	   @SuppressWarnings("unused")
	ReverseString obj = new ReverseString(); // Constructor is invoked as soon as an object of the call is created
   }
   
   	  // Static method
   	  static void reverseStringBuffer() {
   	      StringBuffer a = new StringBuffer("Java programming is fun");
   	      System.out.println(a.reverse());
   	  }
  
      // Constructor
   	  ReverseString() {
      String original, reverse = "";
      original = "Too much fun";
      int length = original.length();
       for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + original.charAt(i);
       		System.out.println(reverse);
   	  }
   	  
   	  static {
   		  System.out.println("Static block is executed before main method");
   	  }
}