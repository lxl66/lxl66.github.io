package ch06;
import java.util.*;

public class TestException {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try{
			
			System.out.print("�������һ����:");
			double num1 = input.nextInt();
			
			System.out.print("������ڶ�����:");
			double num2 = input.nextInt();
			
			if(num2 == 0){
				System.out.println("��������Ϊ�㣡");
			}else{
				double result = num1/num2;
				System.out.println(num1+"/"+num2+"="+result);
			}
			
			Student zs = new Student("����");
			
			//zs = null;
			
			zs.study();
			
		}catch(ArithmeticException ex){
			
			System.out.println("��������Ϊ�㣡");
			
		}catch(InputMismatchException ex){
			
			System.out.println("��������");
			
		}catch(NullPointerException ex){
			
			System.out.println("��ָ���쳣���Ҳ�������");
			
		}catch(Exception ex){
			
			System.out.println("�����������");
			System.out.println(ex.getMessage());
			
		}finally {
			
			System.out.println("�������Ҫִ�еĴ��룡");
			
		}
		
		System.out.println("���������");
		
	}
	
}
