package Activity06;

/*6)Find the value of the expression and explain its 
 * compilation behavior: (20+6*90)-30/5*4
 *  Code to be written by trainees
 */

public class Activity06 {

	public static void main(String[] args) {

		int a = (20+6*90)-30/5*4;
		System.out.println(a);

		/*(20 + 6 * 90):

First, the multiplication 6 * 90 is evaluated, resulting in 540.
Then, the addition 20 + 540 is evaluated, resulting in 560.
30 / 5 * 4:

First, the division 30 / 5 is evaluated, resulting in 6.
Then, the multiplication 6 * 4 is evaluated, resulting in 24.
Finally, (20+6*90)-30/5*4:

The previously evaluated results are substituted: 560 - 24.
Resulting in 536.
		 * 
		 */
		
	}

}
