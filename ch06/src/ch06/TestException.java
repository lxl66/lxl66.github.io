package ch06;
import java.util.*;

public class TestException {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try{
			
			System.out.print("请输入第一个数:");
			double num1 = input.nextInt();
			
			System.out.print("请输入第二个数:");
			double num2 = input.nextInt();
			
			if(num2 == 0){
				System.out.println("除数不能为零！");
			}else{
				double result = num1/num2;
				System.out.println(num1+"/"+num2+"="+result);
			}
			
			Student zs = new Student("张三");
			
			//zs = null;
			
			zs.study();
			
		}catch(ArithmeticException ex){
			
			System.out.println("除数不能为零！");
			
		}catch(InputMismatchException ex){
			
			System.out.println("输入有误！");
			
		}catch(NullPointerException ex){
			
			System.out.println("空指针异常，找不到对象！");
			
		}catch(Exception ex){
			
			System.out.println("程序出错啦！");
			System.out.println(ex.getMessage());
			
		}finally {
			
			System.out.println("报错与否都要执行的代码！");
			
		}
		
		System.out.println("程序结束！");
		
	}
	
}
