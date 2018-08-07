package ch07;

import java.util.Scanner;

public class TestFormat {

	public static void main(String[] args) {

		Scanner input  = new Scanner(System.in); 
		
		System.out.print("学号：");
		String no = input.next();
		
		System.out.print("姓名：");
		String name = input.next();
		
		System.out.print("年龄：");
		int age = input.nextInt();
		
		System.out.print("性别：");
		char sex = input.next().charAt(0);
		
		Student stu = new Student(no, name, age, sex);

		
		//从stu学生对象中取出数据，然后拼成一个sql语句字符串
		//String sql = "insert into StuInfo values('1001','张三',18,'男')";
		
		//String sql = "insert into StuInfo values('"+stu.getNo()+"','"+stu.getName()+"',"+stu.getAge()+",'"+stu.getSex()+"')";
		
		
		String sql = "insert into StuInfo values('%s','%s',%d,'%c')";
		
		sql = String.format(sql,stu.getNo(),stu.getName(),stu.getAge(),stu.getSex());
		
		System.out.println();
		
		System.out.println(sql);
				
		
	}
	
}
