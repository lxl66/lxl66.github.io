package ch07;

import java.util.Scanner;

public class TestFormat {

	public static void main(String[] args) {

		Scanner input  = new Scanner(System.in); 
		
		System.out.print("ѧ�ţ�");
		String no = input.next();
		
		System.out.print("������");
		String name = input.next();
		
		System.out.print("���䣺");
		int age = input.nextInt();
		
		System.out.print("�Ա�");
		char sex = input.next().charAt(0);
		
		Student stu = new Student(no, name, age, sex);

		
		//��stuѧ��������ȡ�����ݣ�Ȼ��ƴ��һ��sql����ַ���
		//String sql = "insert into StuInfo values('1001','����',18,'��')";
		
		//String sql = "insert into StuInfo values('"+stu.getNo()+"','"+stu.getName()+"',"+stu.getAge()+",'"+stu.getSex()+"')";
		
		
		String sql = "insert into StuInfo values('%s','%s',%d,'%c')";
		
		sql = String.format(sql,stu.getNo(),stu.getName(),stu.getAge(),stu.getSex());
		
		System.out.println();
		
		System.out.println(sql);
				
		
	}
	
}
