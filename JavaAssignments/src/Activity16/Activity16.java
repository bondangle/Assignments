package Activity16;

import java.util.Scanner;

/*16)Create codes to find if license can be given from the age of 
 * 18 to 70 years where the age needs to be an input from console. 
 * Use Ternary operator.
 * 
 */
public class Activity16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = input.nextInt();
		String eligibility = (age >= 18 && age <= 70) ? "You are eligible." : "You are not eligible";
		System.out.println(eligibility);
		input.close();
	}

}
