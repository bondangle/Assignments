package Activity24;

import java.util.Arrays;

/*
 * 24)Create a two-dimensional double array with 4 rows and 5 columns. 
 * Sort the arrays in ascending and descending order
 */

public class Activity24 {

	public static void main(String[] args) {
	
		double[][] a= {{1.3,2.5,3.6,4.5,5.9},
						{6.2,7.6,8.7,9.1,10.2},
						{11.4,12.6,13.1,14.9,15.3},
						{16.4,17.7,18.7,19.2,20.8}};
		
		for(int i=0;i<a.length;i++)
		{
			Arrays.sort(a[i]);
		}
		
		System.out.println("Ascending order: ");
		for(double[] d : a)
		{
			for(double value : d)
			{
				System.out.print(value + "  ");
			}
			System.out.println();
		}
		
		
		
	}

}
