package Activity22;

/*
 * 22)Create a logical code add first 10 numbers starting with 1. 
 * When the summation reaches 10, we need to show labeled break statement 
 * terminates the outer most FOR loop. Let the label name be “Run”.
 */
public class Activity22 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Run:
			for(int i = 1;i<=10;i++)
			{
				for(int j=1;j<=i;j++)
				{
					sum = sum + j;
					if(sum>=10)
					{
						break Run;
					}
				}
			}
		
		System.out.println(sum);

	}

}
