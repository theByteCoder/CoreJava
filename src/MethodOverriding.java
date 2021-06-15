// Please do not make class as abstract. If we mark the Vehicle class as Abstract, the class can not be instantiated
class Vehicle{  	
	void run() {
		System.out.println("Method of vehicle class");
	} 
}  

class MethodOverriding extends Vehicle{  

	void run(){
		System.out.println("Method of MethodOverriding class ");
		}  
	  
	public static void main(String args[]){  
		Vehicle obj = new Vehicle();  // If we mark the Vehicle class as Abstract, the class can not be instantiate  
	obj.run();  
	} 
}