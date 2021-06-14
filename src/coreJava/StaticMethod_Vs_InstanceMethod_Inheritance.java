package coreJava;

class methodClass {
	
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

public class StaticMethod_Vs_InstanceMethod_Inheritance extends methodClass {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
    	StaticMethod_Vs_InstanceMethod_Inheritance myCat = new StaticMethod_Vs_InstanceMethod_Inheritance();
    	methodClass myAnimal = myCat;
    	methodClass.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}

