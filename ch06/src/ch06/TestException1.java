package ch06;

import java.util.Scanner;

public class TestException1 {

	public void calc(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������һ����:");
		double num1 = input.nextInt();
		
		System.out.print("������ڶ�����:");
		double num2 = input.nextInt();
		
		if(num2 == 0){
			//�׳��쳣
			//RuntimeException������ʱ�쳣
			throw new RuntimeException("��������Ϊ�㣡");
		}
		
		double result = num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		
	}

	public void test(){
		
		//try {
			calc();
		//} catch (Exception e) {
		//	System.out.println("test�������쳣���д���");
		//}
		
	}
	
	public static void main(String[] args) {
		
		TestException1 tx = new TestException1();
		
		try {
			tx.test();
		} catch (Exception e) {
			System.out.println("main�������쳣���д���");
		}
		
		System.out.println("���������");
		
	}
	
}
