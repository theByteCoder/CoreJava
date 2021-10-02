package core;

interface defaultMethodTest {

    public void abstractMethod(String name);

    default void defaultMethod() {
        System.out.println("Default method");
    }
}

public class Interface_DefaultMthods implements defaultMethodTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        defaultMethodTest obj = new Interface_DefaultMthods();
        obj.abstractMethod("Success");
        obj.defaultMethod();
    }

    @Override
    public void abstractMethod(String name) {
        // TODO Auto-generated method stub
        System.out.println("Abstract method " + name);
    }

}
