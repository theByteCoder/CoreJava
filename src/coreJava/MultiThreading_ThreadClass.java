package coreJava;

//Java code for thread creation by extending the Thread class
class MultiThreadingCode1 extends Thread
{
 public void run()
 {
     try
     {
         // Displaying the thread that is running
         System.out.println ("Thread " + Thread.currentThread().getId() +  " is running");

     }
     catch (Exception e)
     {
         // Throwing an exception
         System.out.println ("Exception is caught " + e);
     }
 }
}

//Main Class
public class MultiThreading_ThreadClass
{
 public static void main(String[] args)
 {
     int n = 8; // Number of threads
     for (int i=0; i<n; i++)
     {
    	 MultiThreadingCode1 object = new MultiThreadingCode1();
         object.start();
     }
 }
}