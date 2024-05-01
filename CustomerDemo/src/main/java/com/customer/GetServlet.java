package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			

			String  uID=request.getParameter("boid");//get order id 
		
			try {
				List<Order> OrderDetails =CustomerDBUtil.gotorder(uID);
				request.setAttribute("OrderDetails",OrderDetails);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher dis= request.getRequestDispatcher("vieworder.jsp");
			dis.forward(request, response);
			
			
	
	}

}
