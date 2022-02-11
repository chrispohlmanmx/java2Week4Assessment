package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NumberAdder;
import model.NumberMultiplier;

/**
 * Servlet implementation class multiplyNumbersServlet
 */
@WebServlet("/multiplyNumbersServlet")
public class multiplyNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public multiplyNumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String num3 = request.getParameter("num3");
		
		NumberMultiplier userNums = new NumberMultiplier(Integer.parseInt(num1), Integer.parseInt(num2), Integer.parseInt(num3));
		
		request.setAttribute("userProduct", userNums);
		
		getServletContext().getRequestDispatcher("/multiplyResult.jsp").forward(request, response);
	}

}
