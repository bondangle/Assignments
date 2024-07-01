package Activity35;

/*
 * 34)Create a student class with private non-static fields like age,
 *  name and gender. Create public get and set method to get and 
 *  set values of these fields. Create another class called Test and create 
 *  the object of the student class. Use the set and get method of student 
 *  class in the Test class with instance variable of the object
 */

public class Student {

	private int age;
	private String name;
	private char gender;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
}
