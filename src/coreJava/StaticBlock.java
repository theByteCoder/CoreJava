package coreJava;

//All Static blocks are always executed before main method

class StaticBlock {
  public static void main(String[] args) {
    System.out.println("Main method is executed.");
    }
 
  static {
    System.out.println("Static block 1 is executed before main method.");
  }
  
  static {
	System.out.println("Static block 2 is executed before main method.");
  }
}
