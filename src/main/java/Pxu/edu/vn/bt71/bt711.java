package Pxu.edu.vn.bt71;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bt711
 */
@WebServlet("/bt711")
public class bt711 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bt711() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		


		    // Lấy giá trị từ các thành phần của form
		    String textFieldValue = request.getParameter("text-field");
		    String hiddenFieldValue = request.getParameter("hidden-field");
		    String passwordFieldValue =request.getParameter("password-field");
		    String checkBoxValue = request.getParameter("check-box");
		    String listBoxValue = request.getParameter("list-box");
		    String radioButtonValue = request.getParameter("radio-button");

		    // Hiển thị giá trị trên màn hình
		        out.println("<h1><In ra thông tin cua form nhu sau:</h1>");
		        out.println("<p>Text Field: " + textFieldValue + "</p>");
		        out.println("<p>Hidden Field: " + hiddenFieldValue + "</p>");
		        out.println("<p>password-field: " + passwordFieldValue + "</p>");
		        out.println("<p>Check Box: " + checkBoxValue + "</p>");
		        out.println("<p>List Box: " + listBoxValue + "</p>");
		        out.println("<p>Radio Button: " + radioButtonValue + "</p>");
		  }
		
	}


