package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//声明里定义的变量会转译到这里
	String name = "李四";
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		//Java脚本中定义的变量会转译到这里
		String name = "张三";
		
		System.out.println(name);
		
		PrintWriter out = response.getWriter();
		
		out.write("<!--这里是HTML注释(客户端注释)-->");

		/*这里是Jsp注释(服务器注释)*/
		
		out.write("<body>");
		
		out.write("<h1>HelloWorld</h1>");
		
		out.write("服务器当前时间："+new java.util.Date());
		
		out.write("</body>");
		
		
	}

}
