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
			throw new AgeException("年龄必须大于零！");
		}else{
			this.age = age;
		}
		
	}

	//重写toString方法
	public String toString() {
		//return "我是"+name+"，今天"+age+"岁！";
		return "我是"+name+"，今天"+age+"岁！";
	}
	
	public void study(){
		System.out.println(name + "开始学习！");
	}
	
}
