package Activity03;


/*3)Create, double and float variable with values and multiply them. 
 * Assign the value of long variable to the multiplied value of float and double. 
 * See if autoboxing happens. 
 */
public class Activity03 {

	public static void main(String[] args) {
		
		double a = 10.37D;
		float b = 23.3F;
		double c = a*b;
		long d = (long)c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
