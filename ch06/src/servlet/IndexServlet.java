package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//�����ﶨ��ı�����ת�뵽����
	String name = "����";
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		//Java�ű��ж���ı�����ת�뵽����
		String name = "����";
		
		System.out.println(name);
		
		PrintWriter out = response.getWriter();
		
		out.write("<!--������HTMLע��(�ͻ���ע��)-->");

		/*������Jspע��(������ע��)*/
		
		out.write("<body>");
		
		out.write("<h1>HelloWorld</h1>");
		
		out.write("��������ǰʱ�䣺"+new java.util.Date());
		
		out.write("</body>");
		
		
	}

}
