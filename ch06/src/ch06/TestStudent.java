package ch06;

public class TestStudent {

	public static void main(String[] args) {
		
		try{
			
			Student stu = new Student("张三", -5);
			
			System.out.println(stu);
			
		}catch(Exception ex){
			
			System.out.println(ex.getMessage());
			
		}
		
		System.out.println("程序结束！");
	}
	
}
