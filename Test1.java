package test;

public class Test1 {
	
	static Test1 t1 = new Test1();   // new object created for the non-static method
	
	                                 // below is the syntax of creating a new class out side or inside of main method
	                                 // ClassName objName = new ClassName();
	
	                                 // if this object created in the main method then before object there is no need to put static
	                                 // because it is automatically static
	                                 // it is shown below	
	                                 // so this object t1 is global variable 
	
	static Test2 t2 = new Test2();   // here is the new object is created to call Class of Test2 non static object to Class of Test1
	                                 // where you want to call non static object of other  class, create the new object in which class you want to call other class object.
	                                 // 
	
	static Test3 t3 = new Test3();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if object is created here then it is written as below
		
		// Test t1 = new Test1();
		
		// this t1 object is local variable 
		
		
		System.out.println("I am in main methiod");
		printMe();  // static method called directly
		System.out.println("After Print ME");
		scanMe();    // static method called directly 
		t1.paintMe();  // non-static method run through the object we created.
		t1.testMe();  // another non-static method is run through same object we created
		
		Test2.blue();   //here is blue static object is called from Test2 class
		                // so first call class and then call static method.
		                // general syntax to call static object from other class is as below
		                // ClassName.methodName();
		
		t2.red();       // this is the Test2 class non static object called in Test1 class
		
		
		
		
		           // though the scan me method is write below first before the print me method
		           // java always execute main method. 
		           // below method we can use in any main method.
		           // any static method can run in main method directly
		           // however for any non-static method we want to run in main method in main method
		           // we have to create object 
		           // to create object syntax is as below.
		           // ClassName objName = new ClassName();
		
		Test3.square();
		t3.circle();
		
		

	}
	
	public static void scanMe() {
		System.out.println("scanMe");
	}
	
	public static void printMe()  // static method
	{
		System.out.println("PrintMe");
	}
	
	public void paintMe() // non-static method
	{
		System.out.println("paintMe");
	}
	
	public void testMe() {
		System.out.println("testMe");
	}
  
}
