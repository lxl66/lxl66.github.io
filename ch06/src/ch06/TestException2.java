package ch06;

import java.util.Scanner;

public class TestException2 {

	//throws�ؼ��������쳣�ķ���
	public void calc() throws Exception{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������һ����:");
		double num1 = input.nextInt();
		
		System.out.print("������ڶ�����:");
		double num2 = input.nextInt();
		
		if(num2 == 0){
			//�׳��쳣
			throw new DivByZeroException("��������Ϊ�㣡");
		}
			
		double result = num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		
	}
	
	public void test() throws Exception{
		
		//���������˱���ʱ�쳣�ķ�������������쳣����
		//���ǽ���ǰ����Ҳ����Ϊһ���쳣����
		calc();
		
	}
	
	public static void main(String[] args)  throws Exception {
		
		TestException2 tx = new TestException2();

		try {
			tx.test();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("���������");
		}

	}

}
