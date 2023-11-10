package expense;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		PrintWriter pw=response.getWriter();
		
		String s=request.getParameter("user_name");
		String p=request.getParameter("password");
		
		if(Login.validate(s,p)) {
			
			RequestDispatcher r=(RequestDispatcher) request.getRequestDispatcher("Hpomepage.html");
			r.forward(request, response);
		}else {
			PrintWriter out = null;
			out.println("incorrect user_name or password");
			RequestDispatcher r=(RequestDispatcher) request.getRequestDispatcher("Login.html");
			r.include(request, response);
		}
		
	}

}
