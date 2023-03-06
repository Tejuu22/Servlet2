package cookies;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ForeachStatement;
@WebServlet("/test2")
public class Test2  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getWriter().print("<h1>this is test2</h1>");
		Cookie[] cookies=req.getCookies();
	   for(Cookie cookie:cookies) {
		   if(cookie.getName().equals("id") || cookie.getName().equals("name"))
		  
			   resp.getWriter().print(cookie.getValue()+"<br>");
		   
	   }
	}
	
}
