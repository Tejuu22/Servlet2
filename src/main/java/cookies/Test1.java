package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test1")
public class Test1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("<h1>this is test1</h1>");
		Cookie cookie=new Cookie("id","1");
		Cookie cookie2=new Cookie("name","raj");
		cookie.setMaxAge(5);
		cookie2.setMaxAge(5);
		
		
		 resp.addCookie(cookie);
		 resp.addCookie(cookie2);
		 
		 resp.sendRedirect("test2");
		
	}
	

}
