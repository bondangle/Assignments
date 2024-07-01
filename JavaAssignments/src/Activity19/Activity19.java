package Activity19;

/*
 * 19)Create code to change the value of the String which is “Hi! Learning Java”. 
 * Change the same String variable’s value to “Hi ! Learning Swing”
a.	Find the value of String kept to a variable: String str = “Hi! Learning Java”
i.	Use the substring() method to get the value “Hi! L”
ii.	Get the index of second instance of “a”.
iii.	Get the index of third instance of “a”.
iv.	Get the length of string

 */

public class Activity19 {

	public static void main(String[] args) {
	
		String a = "Hi! Learning Java";
		a="Hi ! Learning Swing";
		System.out.println(a);
		System.out.println(a.substring(0,6));
		int second= a.indexOf('a',a.indexOf('a')+1);
		System.out.println(second);
		int third = a.indexOf('a',second+1);
		System.out.println(third);
		System.out.println(a.length());

	}

}
