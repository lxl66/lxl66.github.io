package ch06;

public class Student {

	private String name;
	private int age;
	
	public Student(){
		
	}
	
	public Student(String name){
		this.name = name;
	}

	public Student(String name, int age) {
		this.setName(name);
		this.setAge(age);
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
		
		if(age<=0){
			throw new AgeException("�����������㣡");
		}else{
			this.age = age;
		}
		
	}

	//��дtoString����
	public String toString() {
		//return "����"+name+"������"+age+"�꣡";
		return "����"+name+"������"+age+"�꣡";
	}
	
	public void study(){
		System.out.println(name + "��ʼѧϰ��");
	}
	
}
