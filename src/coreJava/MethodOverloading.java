package coreJava;

class DisplayOverloading3
{
   public void disp(char c, int num)
   {
       System.out.println("I’m the first definition of method disp with " + c + " and " + num);
   }
   public void disp(int num, char c)
   {
       System.out.println("I’m the second definition of method disp with " + c + " and " + num);
   }
}

class MethodOverloading
{
	   void disp(int a, double b){
		System.out.println("Method A with " + a + " and " + b);
	   }
	   void disp(int a, double b, double c){
		System.out.println("Method B with " + b + " and " + c);
	   }
	   
	   public static void main(String args[])
	   {
	       DisplayOverloading3 obj1 = new DisplayOverloading3();
	       MethodOverloading obj2 = new MethodOverloading();
	       obj1.disp('x', 51 );
	       obj1.disp(52, 'y');
	       obj2.disp(100, 20.67f);
	   }
	}