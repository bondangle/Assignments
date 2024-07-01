package Activity01;


/*1)Creating a class called Animal, define its static field tails, legs with values,
 *  define static methods like running() and eating() with its bodies , 
 *  if required define local variables inside method . 
 *  Call the field and variables inside the main method.
 */
public class Animal {

	static int tail = 1;
	static int legs = 4;

	static void running() {
		int speed = 4;
		System.out.println("Animal is running at the speed of " + speed + " kmph.");
	}

	static void eating() {
		String type = "carnivorous";
		System.out.println("Animal is " + type);
	}

	public static void main(String[] args) {

		System.out.println("Number of tails: " + tail);
		System.out.println("Number of legs: " + legs);
		running();
		eating();

	}

}
