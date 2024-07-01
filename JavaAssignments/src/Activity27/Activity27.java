package Activity27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 27)Create a list of ten double elements. 
 * Sort out the list in ascending order. 
 * Create a sub list of elements from second element to fifth element.
 */

public class Activity27 {

	public static void main(String[] args) {
	
		
		List<Double> a = new ArrayList<>();
		a.add(29.28D);
		a.add(37.27D);
		a.add(10.47D);
		a.add(92.82D);
		a.add(27.83D);
		a.add(39.28D);
		a.add(32.27D);
		a.add(80.47D);
		a.add(92.82D);
		a.add(25.83D);
		
		Collections.sort(a);
		List<Double> b = a.subList(1, 5);
		
		System.out.println("Original List: " + a);
		System.out.println("Sublist: " + b);

	}

}
