package atj.git;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Konwerter extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double param1 = Double.parseDouble(request.getParameter("a"));
		String param2 = request.getParameter("operacje");
//		double param3 = Double.parseDouble(request.getParameter("b"));
		

		double res = calc(param1, param2.charAt(0));
		
		request.getSession().setAttribute("result", new Double(res));
		
		//response.getWriter().println("Wynik = " + res);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Konwerter.jsp");
		requestDispatcher.forward(request, response);
		
	}



	private double calc(double a, Character operacje) {
		double suma = 0;
		switch (operacje) {
		case '=':
			suma = 32 + (1.8 * a);
			break;
		case '~':
			suma = 0.5556*(a - 32);
			break;
		}
		return suma;
	}

}

