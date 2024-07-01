package Activity29;

/*
 * 29)Create a modulus method which returns a String numeric value.
 */
public class Activity29 {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		System.out.println(modulus(a,b));
	}

	
	public static String modulus(int a, int b)
	{
		return String.valueOf(a/b);
	}
}


