package Activity17;
//17)Create a logic of code to add even numbers from 1 to 100

public class Activity17 {

	public static void main(String[] args) {
	
		int sum = 0;
		
		for (int i = 1; i<=100;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of even numbers from 1 to 100 is "+sum);

	}

}
