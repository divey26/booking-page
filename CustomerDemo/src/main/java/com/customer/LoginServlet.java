package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String picloc=request.getParameter("ploc");//get pickup location 
		String picdate =request.getParameter("pdate");//get pickup date
	
		try {
			List<Customer> VehDetails =CustomerDBUtil.validate(picloc,picdate );
			request.setAttribute("VehDetails",VehDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dis= request.getRequestDispatcher("useraccount.jsp");//redirect to the page that display matched vehicle
		dis.forward(request, response);
		
	}


}
