package coreJava;

class MultipleClasses {
	
	MultipleClasses() {
	    System.out.println("Constructor of MultipleClasses class.");
	}
	 
	  void computer_method() {
	    System.out.println("Power gone! Shut down your PC soon...");
	  }
	 
	  public static void main(String[] args) {
		MultipleClasses my = new MultipleClasses();
	    Laptop your = new Laptop();
	 
	    my.computer_method();
	    your.laptop_method();
	  }
	}
	 
	class Laptop {
	  Laptop() {
	    System.out.println("Constructor of Laptop class.");
	  }
	 
	  void laptop_method() {
	    System.out.println("99% Battery available.");
	  }
	} 
