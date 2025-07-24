package result;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String m = request.getParameter("tbMath");
		int math = Integer.parseInt(m);
		String p = request.getParameter("tbPhy");
		int phy = Integer.parseInt(p);
		String c = request.getParameter("tbChem");
		int chem = Integer.parseInt(c);
		
		int total= math+phy+chem;
		int per= total*100/300;
		String grade=null;
		if(per>=60) {
			grade="First Class";
		}
		else if(per>=35) {
			grade="Second Class";
		}
		else {
			grade="Fail";
		}
		
		request.setAttribute("sum", total);
		request.setAttribute("Percentage", per);
		request.setAttribute("Grade", grade);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ResultSheet.jsp");
		dispatcher.forward(request, response);
	}

}
