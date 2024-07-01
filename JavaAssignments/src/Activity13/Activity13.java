package Activity13;

//13)Find the value of the expression and explain why: 
// 2*3 >=3*2  && 45+3*3 <=32  !  4+5-5 < 9 || 45

public class Activity13 {

	public static void main(String[] args) {
		
		boolean a = (2*3 >= 3*2);
		boolean b = (45 + 3*3 <= 32);
		boolean c = (4 + 5 - 5 < 9);
		boolean d = a && b ||c;		
		System.out.println(d);

	}

}
