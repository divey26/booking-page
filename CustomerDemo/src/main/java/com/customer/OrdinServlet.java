package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OrdinServlet")
public class OrdinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		String pickLoca= request.getParameter("ploc");//get pickup location 
		String dropLoca= request.getParameter("dloc");//get drop location 
		String pickdate= request.getParameter("pdate");//get pick location 
		String dropdate= request.getParameter("ddate");//get drop date
		String time= request.getParameter("time");//get time
		
		
		boolean isTrue;
		
		isTrue=CustomerDBUtil.insertcustomer(pickLoca, dropLoca, pickdate, dropdate, time);
		
		if(isTrue==true) {
			RequestDispatcher dis=request.getRequestDispatcher("insertedSuccess.jsp");// redirect to success page
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis1=request.getRequestDispatcher("insertUnuccess.jsp");// redirect to unsuccess page
			dis1.forward(request, response);

		}

	
	
	
	
	
	
	
	}

}
