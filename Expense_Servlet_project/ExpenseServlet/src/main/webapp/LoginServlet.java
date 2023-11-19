package expense;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxResultset;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;

import jakarta.servlet.RequestDispatcher;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		response.setContentType("text/html");
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/daily_spends", "root", "Santu9999@");
	    String s=request.getParameter("user_name");
		String p=request.getParameter("password");
		PreparedStatement ps=con.prepareStatement("select User_name from Users_Details where User_name=? and User_password=?");
		ps.setString(1, s);
		ps.setString(2, p);
	ResultSet rs=ps.executeQuery();
	 if(rs.next()) {
		 RequestDispatcher rd=request.getRequestDispatcher("HomePage.html");
		 rd.forward(request, response);
	 }else {
		 RequestDispatcher rd=request.getRequestDispatcher("<a href=Login.html />");
	 }
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}


