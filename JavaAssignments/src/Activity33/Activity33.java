package Activity33;


/*
 * 33)Create a subtraction method without parameters. 
 * Create overloading methods of subtraction method with number of parameters as 2 and 3, 
 * parameter type as String and double.
 */
public class Activity33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subtract();
		subtract(10,5);
		subtract(10,3,2);
		
	}

	
	public static void subtract()
	{
		System.out.println("No Params");
	}
	
	public static void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
	
	public static void subtract(int a,int b, int c)
	{
		System.out.println(a-b-c);	
	}
	
}
