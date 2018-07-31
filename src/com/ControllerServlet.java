package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String buttonName = request.getParameter("buttonName");

		switch (buttonName) {
		case "add":
			RequestDispatcher rd1 = request.getRequestDispatcher("AddServlet");
			rd1.forward(request, response);
			break;

		case "update":
			RequestDispatcher rd2 = request.getRequestDispatcher("UpdateServlet");
			rd2.forward(request, response);
			break;
			
		case "delete":
			RequestDispatcher rd3 = request.getRequestDispatcher("DeleteServlet");
			rd3.forward(request, response);
			break;

		case "view":
			RequestDispatcher rd4 = request.getRequestDispatcher("ViewServlet");
			rd4.forward(request, response);
			break;

		case "search":
			RequestDispatcher rd5 = request.getRequestDispatcher("SearchServlet");
			rd5.forward(request, response);
			break;



		default:
			break;
		}

	}

}
