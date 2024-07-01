package Activity31.PackageA;

public class ClassA {


/*
 * 31)Create two classes in two different packages. 
 * Define all fields and methods in one class with access modifiers like public, 
 * protected, private and default. 
 * Second class in second package to create an instance of 
 * first class in first package and to use its fields and methods. 
 * See the behaviour of access modifiers.
 */


	public int instanceVariableA1 = 1;
	protected int instanceVariableA2 = 2;
	private int instanceVariableA3 = 3;
	int instanceVariableA4 = 4;
	
	public void methodA1()
	{
		System.out.println("This is from MethodA1");
	}
	
	protected void methodA2()
	{
		System.out.println("This is from MethodA2");
	}
	
	private void methodA3()
	{
		System.out.println("This is from MethodA3");
	}
	
	void methodA4()
	{
		System.out.println("This is from MethodA4");
	}
	
}
