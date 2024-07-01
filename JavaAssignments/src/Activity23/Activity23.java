package Activity23;

/*
 * 23)Create a while loop to multiply numbers from 10 to 1. 
 * When the multiplied value reaches 720, CONTINUE the loop.
 */

public class Activity23 {

	public static void main(String[] args) {
		
		int multValue = 1;
		int a =10;
		
		while(a>=1)
		{
			System.out.println("Multiplying "+ a + " and " + multValue);
			multValue=multValue*a;
			
			a--;
			System.out.println("Multiplication value is " + multValue);
			if (multValue==720)
			{
				
				System.out.println("Reached 720");
				continue;
			}
				
		}
		System.out.println(multValue);
	}

}
