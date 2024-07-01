package Activity26;

import java.util.ArrayList;
import java.util.List;

/*
 * 26)Create a list of Strings having 10 elements. 
 * Remove the tenth element value with new value. 
 * Get the index of third element. 
 * Then iterate over the list
 */
public class Activity26 {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<>();
		a.add("Celebration");
		a.add("Celebratio");
		a.add("Celebrati");
		a.add("Celebrat");
		a.add("Celebra");
		a.add("Celebr");
		a.add("Celeb");
		a.add("Cele");
		a.add("Cel");
		a.add("Ce");
	
	
	for (Object b : a)
	{
		System.out.println(b);
	}
		
	a.set(9, "Replaced");
	
	for (Object c : a)
	{
		System.out.println(c);
	}
	
	}
	
	

}
