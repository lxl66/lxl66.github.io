package ch07;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		
		String str = "abcdefghijklmn";
		
		//length�������Ի�ȡ�ַ����ĳ���
		System.out.println("�ַ����ĳ����ǣ�"+str.length());
		
		//charAt�������Ի�ȡ�ַ�����ָ��λ��(�±�)�ϵ��ַ�
		char ch = str.charAt(4);
		System.out.println("�ַ����е�����ַ��ǣ�"+ch);
		
		
		Scanner input = new Scanner(System.in); 
		
		//String name = "����";
		System.out.print("������������");
		String name = input.next();
		//String name = new String("����");
		
		/*
		if(name == "����"){
			System.out.println("name�ַ��������ϴ��������");
		}else{
			System.out.println("name�ַ��������ϴ�Ĳ�������");
		}
		*/
		
		//equals���������ж������ַ�����ֵ�Ƿ���ȣ�����true��false
		if("����".equals(name)){
			System.out.println("�����������");
		}else{
			System.out.println("����Ĳ�������");
		}
		
		//compareTo����Ҳ�����ж������ַ�����ֵ�Ƿ����
		//����������������ȣ����صĲ�������������
		int num = "����".compareTo(name);
		System.out.println(num);
		
		//equalsIgnoreCase��compareToIgnoreCase�������ж�ʱ���Դ�Сд
		if("abc".equalsIgnoreCase("ABC")){
			System.out.println("\"abc\"��\"ABC\"���Դ�Сд�����");
		}else{
			System.out.println("�����");
		}
		
		
		//indexOf()
		
		//lastIndexOf()
		
		//replace()
		
		//split()
		
		//startsWith()
		
		//endsWith()
		
		//substring()
		
		//toLowerCase()
		
		//toUpperCase()
		
		//trim()
		
		//valueOf()
		
		
		
	}
	
}
