package url_rewriting;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/home")
public class Home extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("id")==null) {
			resp.getWriter().print("<h1>First Login then only you come to login page</h1>");
	} 
	
		else {
			resp.getWriter().print("<h1>login success</h1>");
			resp.getWriter().print("<h1>Welcome to homepage</h1>");
			
			
		}
	}

}
