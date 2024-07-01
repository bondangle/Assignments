package Activity18;
/*18)Create variable with literal String values 
 * (another way to create object of String class) 
 * and variable with numbers. 
 * Show the behavior of different expression when 
 * String is concatenated with numbers
 */
public class Activity18 {

	public static void main(String[] args) {
		
		String a = "Vikrant";
		byte b = 10;
		short c = 19;
		int d = 187;
		long e = 728L;
		float f = 876.32f;
		double g = 827323.11d;
		
		System.out.println("String + byte: "+a+b);
		System.out.println("String + short: "+a+c);
		System.out.println("String + int: "+a+d);
		System.out.println("String + long: "+a+e);
		System.out.println("String + float: "+a+f);
		System.out.println("String + double: "+a+g);
	}

}
