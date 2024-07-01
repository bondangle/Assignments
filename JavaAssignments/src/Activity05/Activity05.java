package Activity05;

/*5)Create a numeric String variable. 
 * Convert the value from String to int and String to 
 * double format using the respective wrapper classes
 */


public class Activity05 {

	public static void main(String[] args) {
		
		String a ="123";
		Integer b = Integer.parseInt(a);
		Double c = Double.parseDouble(a);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
