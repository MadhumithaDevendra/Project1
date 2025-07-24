package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter wr = response.getWriter();
		wr.println("<h2> welcome to doPost() method</h2>");
		
		String name = request.getParameter("tbName");
		String number = request.getParameter("tbNumber");
		wr.println(name+"\n");
		wr.println();
		wr.println("\n"+number);
	}

}
