package Activity32;


/*
 * 32)Create the return statement to return the area of a triangle 
 * where the return type of the method is double. 
 * Call this method in main method and assign the value of the method to a variable.
 */
public class Activity32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 21;
		int height = 32;
		
		System.out.println("Area of triangle with base as " + base + " and height as "+ height + " is " + areaOfTriangle(base,height));
	}

	public static double areaOfTriangle(int b, int h)
	{
		double area = 0.5*b*h;
		return area;
	}
	
	
	
}
