public class SynchronizedMethods {
	
	static int c = 0;

    public synchronized void increment() {
        c++;
        System.out.println(c);
    }

    public synchronized void decrement() {
        c--;
        System.out.println(c);
    }

    public synchronized int value() {
    	System.out.println(c);
        return c;
    }

    public static void main(String args[]) {
    	SynchronizedMethods obj = new SynchronizedMethods();
    	obj.increment();
    	obj.decrement();
    	obj.value();
    }
}