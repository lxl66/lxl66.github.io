package ch06;
/*
 * 如果自定义编译时异常，则继承Exception类
 * 如果自定义运行时异常，则继承RuntimeException类
 */
public class DivByZeroException extends RuntimeException {

	public DivByZeroException(String msg){
		//调用父类带参的构造函数
		super(msg);
	}
	
}
