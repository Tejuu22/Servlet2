package url_rewriting;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("x")==null)
		{
			resp.getWriter().print("<h1>Login from valid page this is invalid");
		}
		else {
		
		
		resp.getWriter().print("<h1>Login success</h1>");
		resp.getWriter().print("<h1>Logging in</h1>");
		//req.getRequestDispatcher("home?id=113").include(req, resp);
		resp.sendRedirect("home?id=113");	
		
	}
	}
}


