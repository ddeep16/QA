package test;

public class IfConditionTese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		int b = 20;
		
		if (a==b) // for number comparison use == command
		{
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("a is not equal to b");
		}
		
		String expected = "selenium";
		String atcual = "selenium";
		if (expected.equals(atcual)) // for string comparison use string.eq command
		{           
			System.out.println("expected is equal to actual");
		}else {
			System.out.println("expected is not equal to actual");
		}

	}
	

}
