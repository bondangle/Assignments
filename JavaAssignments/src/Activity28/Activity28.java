package Activity28;

import java.util.ArrayList;
import java.util.List;

/*
 * 28)Create a list of integer values having six elements 
 * and convert it to an array. 
 * And get the value from fifth index of the array.
 */
public class Activity28 {

	public static void main(String[] args) {
		
		
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		Integer[] b = a.toArray(new Integer[0]);
		System.out.println(b[5]);

	}

}
