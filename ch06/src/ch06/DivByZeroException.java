package ch06;
/*
 * ����Զ������ʱ�쳣����̳�Exception��
 * ����Զ�������ʱ�쳣����̳�RuntimeException��
 */
public class DivByZeroException extends RuntimeException {

	public DivByZeroException(String msg){
		//���ø�����εĹ��캯��
		super(msg);
	}
	
}
