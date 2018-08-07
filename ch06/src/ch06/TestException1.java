package ch06;

import java.util.Scanner;

public class TestException1 {

	public void calc(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入第一个数:");
		double num1 = input.nextInt();
		
		System.out.print("请输入第二个数:");
		double num2 = input.nextInt();
		
		if(num2 == 0){
			//抛出异常
			//RuntimeException是运行时异常
			throw new RuntimeException("除数不能为零！");
		}
		
		double result = num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		
	}

	public void test(){
		
		//try {
			calc();
		//} catch (Exception e) {
		//	System.out.println("test方法对异常进行处理！");
		//}
		
	}
	
	public static void main(String[] args) {
		
		TestException1 tx = new TestException1();
		
		try {
			tx.test();
		} catch (Exception e) {
			System.out.println("main方法对异常进行处理！");
		}
		
		System.out.println("程序结束！");
		
	}
	
}
