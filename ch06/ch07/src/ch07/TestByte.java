package ch07;

public class TestByte {

	public static void main(String[] args) {
		
		//toCharArray�������Խ��ַ���תΪ�ַ�����
		char[] chs = "abc".toCharArray();
		//char[] chs = {'a','b','c'};
		/*
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		*/
		
		//getBytes�������Խ��ַ���תΪ�ֽ�����
		byte[] b = "abc".getBytes();

		//�ֽ�����תΪ�ַ���
		String s1 = new String(b);
		//�ַ�����תΪ�ַ���
		String s2 = new String(chs);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		/*
		1byte = 8bit
				
		�ַ���"abc"
				
		�ַ�����{'a','b','c'}
		
		��������{97,98,99}
				
		�ֽ�����{01100001,01100010,01100011}
		*/
	}
	
}
