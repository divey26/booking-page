package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CancelServlet")
public class CancelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String cbid= request.getParameter("coid");//get order id 

		
		boolean isTrue;//variable declaration
		
		isTrue=CustomerDBUtil.cancelbooking(cbid);//calling function
		
		if(isTrue==true) {
			RequestDispatcher dis=request.getRequestDispatcher("insertedSuccess.jsp");//redirect to success page
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis=request.getRequestDispatcher("insertUnuccess.jsp");//redirect to unsuccess page
			dis.forward(request, response);

		}
	
	
	}

}
