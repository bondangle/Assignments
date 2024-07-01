package Activity20;


/*
 * 20)Find the value of string kept to a variable: String str = “Hi! Learning AWT     ”
i.	Convert to uppercase and lowercase.
ii.	Trim the spaces
iii.	Does it start with “h”?

 */
public class Activity20 {

	public static void main(String[] args) {
		String str = "Hi! Learning AWT     ";
		String Uppercase = str.toUpperCase();
		String Lowercase = str.toLowerCase();
		String trimmed = str.trim();
		String startWithH=(str.substring(0, 1)=="h")? "Starts with h": "Doesn't start with h";
		System.out.println("Original string: " + str);
		System.out.println("Uppercase is: "+ Uppercase);
		System.out.println("Lowercase is: "+ Lowercase);
		System.out.println("Trimmed is: "+ trimmed);
		System.out.println(startWithH);
	}

}
