package coreJava;

class ExceptionHandlingArithmetic {
  public static void main(String[] args) throws Exception{
 
  int a, b;
  float result;
 
  a = 4;
  b = -9;
 
  // try block
  try {
    result  =  (int) Math.floor( (double) a / b );
    System.out.println("Result = " + result);
  }
 
  // catch block
  catch (Exception e) {
    System.out.println("Exception caught: Division by zero.");
  }
  
  // Finally block, always executed
  finally {
      System.out.println("Finally block will execute always.");
    }
  }
}