class ConstructorOverloading {
  String name;
 
  ConstructorOverloading() {
    System.out.println("Constructor method called.");
  }
 
  ConstructorOverloading(String t) {
    name = t;
  }
 
  public static void main(String[] args) {
	  ConstructorOverloading obj1  = new ConstructorOverloading();
	  ConstructorOverloading obj2 = new ConstructorOverloading("Java");
 
	  obj1.setName("C++");
	  obj2.getName();
	  obj1.getName();
  }
 
  void setName(String t) {
    name = t;
  }
 
  void getName() {
    System.out.println("Language name: " + name);
  }
}