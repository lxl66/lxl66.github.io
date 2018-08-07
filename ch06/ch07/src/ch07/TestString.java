package ch07;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		
		String str = "abcdefghijklmn";
		
		//length方法可以获取字符串的长度
		System.out.println("字符串的长度是："+str.length());
		
		//charAt方法可以获取字符串中指定位置(下标)上的字符
		char ch = str.charAt(4);
		System.out.println("字符串中第五个字符是："+ch);
		
		
		Scanner input = new Scanner(System.in); 
		
		//String name = "张三";
		System.out.print("请输入姓名：");
		String name = input.next();
		//String name = new String("张三");
		
		/*
		if(name == "张三"){
			System.out.println("name字符串变量上存的是张三");
		}else{
			System.out.println("name字符串变量上存的不是张三");
		}
		*/
		
		//equals方法可以判断两个字符串的值是否相等，返回true或false
		if("张三".equals(name)){
			System.out.println("输入的是张三");
		}else{
			System.out.println("输入的不是张三");
		}
		
		//compareTo方法也可以判断两个字符串的值是否相等
		//如果返回零则代表相等，返回的不是零则代表不相等
		int num = "张三".compareTo(name);
		System.out.println(num);
		
		//equalsIgnoreCase或compareToIgnoreCase方法，判断时忽略大小写
		if("abc".equalsIgnoreCase("ABC")){
			System.out.println("\"abc\"和\"ABC\"忽略大小写后相等");
		}else{
			System.out.println("不相等");
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
