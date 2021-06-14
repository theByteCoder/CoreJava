package coreJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjCreation {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, CloneNotSupportedException, ClassNotFoundException, IOException {

		// 1. Using new keyword, the classis method
		ObjCreation obj1= new ObjCreation();
		obj1.testMethod();
		
		// 2. Using newInstance() method
		ObjCreation obj2 = ObjCreation.class.newInstance();
		obj2.testMethod();
		
		// 3. Using Constructor class, getConstructor and newInstance() method
		Constructor<ObjCreation> constructor = ObjCreation.class.getConstructor();
		ObjCreation obj3 = constructor.newInstance();
		obj3.testMethod();
		
		// 4. Using clone() method
		ObjCreation obj4 = (ObjCreation) obj3.clone();
		obj4.testMethod();
		
		// 5. Using deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
		ObjCreation obj5 = (ObjCreation) in.readObject();	
		obj5.testMethod();
	}
		
	public void testMethod() {
		System.out.println("Test");
	}
}
