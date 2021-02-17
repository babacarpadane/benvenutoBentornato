package it.objectmethod.saluto.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Saluto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		if (session.getAttribute("name") == null) {
			session.setAttribute("saluto", "Benvenuto!");
			session.setAttribute("name", "esistente");

		} else {
			session.setAttribute("saluto", "Bentornato!");
		}

		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
