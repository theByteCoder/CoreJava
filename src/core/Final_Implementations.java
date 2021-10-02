package core;

// final class FinalClass {
class FinalClass {

    // 	final static int a = 0;
    static int a = 0;

    final public void abstractMethod() {
        System.out.println("final method of non final class implemented");
    }
}

// Final class can not be inherited, thus commenting out final keyword in line 4
public class Final_Implementations extends FinalClass {

    static public void main(String arguemts[]) {

        // 	final int b = 0;
        int b = 0;

        // Creating object of non final class
        Final_Implementations obj = new Final_Implementations();
        obj.abstractMethod();
        System.out.println(a++);
        System.out.println(b++);
    }
}
