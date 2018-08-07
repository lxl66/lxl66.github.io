package ch06;

import java.util.Scanner;

public class TestException2 {

	//throws关键字声明异常的方法
	public void calc() throws Exception{
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入第一个数:");
		double num1 = input.nextInt();
		
		System.out.print("请输入第二个数:");
		double num2 = input.nextInt();
		
		if(num2 == 0){
			//抛出异常
			throw new DivByZeroException("除数不能为零！");
		}
			
		double result = num1/num2;
		System.out.println(num1+"/"+num2+"="+result);
		
	}
	
	public void test() throws Exception{
		
		//调用声明了编译时异常的方法，必须进行异常处理
		//除非讲当前方法也声明为一个异常方法
		calc();
		
	}
	
	public static void main(String[] args)  throws Exception {
		
		TestException2 tx = new TestException2();

		try {
			tx.test();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("程序结束！");
		}

	}

}
