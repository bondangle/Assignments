package Activity25;

import java.util.ArrayList;
import java.util.List;

/*
 * 25)Creating a list of heterogeneous data.
 *  Add five values to it and get all values using FOR /FOR EACH loop
 */

public class Activity25 {

	public static void main(String[] args) {

		
		List<Object> a = new ArrayList<>();
		a.add("Vikrant");
		a.add(23);
		a.add(29.37);
		a.add(37.92D);
		a.add(true);
		
		for(Object o : a)
		{
			System.out.println(o);
		}
		
		

	}

}
