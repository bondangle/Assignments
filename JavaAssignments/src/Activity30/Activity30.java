package Activity30;

/*
 * 30)Create a method to create prime numbers between two ranges. 
 * Ranges should be defined as part of two integer parameter of the method
 */

public class Activity30 {

	public static void main(String[] args) {
		int a= 20;
		int b = 100;
		
		for (int x= a;x<=b;x++)
		{
			if(isPrime(x))
			{
				System.out.println(x);
			}
		}
		
		
	}
	
	
	public static boolean isPrime(int a)
	{
		if(a<=1)
		{
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
