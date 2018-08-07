package ch07;
/*
 *  µÃÂ¿‡
 */
public class Student {

	private String no;
	private String name;
	private int age;
	private char sex;
	
	public Student(){
		
	}
	
	public Student(String no, String name, int age, char sex) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	
}
