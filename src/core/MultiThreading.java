package core;
import java.util.Arrays;

public class MultiThreading extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MultiThreading MultiThreadingObj = new MultiThreading();
            MultiThreadingObj.start();
        }
    }
    public void run() {
        try {
            System.out.println(Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}