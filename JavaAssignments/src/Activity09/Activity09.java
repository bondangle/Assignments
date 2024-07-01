package Activity09;

/*9)Define a variable “a” of int type with value of 10. 
 * Define a variable “b” which is assigned with “a++” .  
 * Add the values of variable “a” and “b” and keep to variable “d”. 
 * Define a variable “c” which is assigned a value of “++d”. 
 * Print out the value of “c” and “d”.
 */

public class Activity09 {

	public static void main(String[] args) {
		int a = 10;
		int b = a++;
		int d = a + b;
		int c = ++d;
		System.out.println(c);
		System.out.println(d);
		}

}
