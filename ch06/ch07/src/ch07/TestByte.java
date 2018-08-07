package ch07;

public class TestByte {

	public static void main(String[] args) {
		
		//toCharArray方法可以将字符串转为字符数组
		char[] chs = "abc".toCharArray();
		//char[] chs = {'a','b','c'};
		/*
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		*/
		
		//getBytes方法可以将字符串转为字节数组
		byte[] b = "abc".getBytes();

		//字节数组转为字符串
		String s1 = new String(b);
		//字符数组转为字符串
		String s2 = new String(chs);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		/*
		1byte = 8bit
				
		字符串"abc"
				
		字符数组{'a','b','c'}
		
		整数数组{97,98,99}
				
		字节数组{01100001,01100010,01100011}
		*/
	}
	
}
