package Activity02;


/*2)Create int, long, double variable with values. 
 * Assign the value of double variable to the addition of int and long variable. 
 * Do type casting. 
 */

public class Activity02 {

	public static void main(String[] args) {
		
		
		int a = 2;
		long b = 48L;
		double c = 37.47D;
		double d = a + b;
		
		System.out.println("int value in double is " + (double)a);
		System.out.println("long value in double is " + (double)b);
		System.out.println("double value is " + c );
		System.out.println("Addition value is " + d );

	}

}
