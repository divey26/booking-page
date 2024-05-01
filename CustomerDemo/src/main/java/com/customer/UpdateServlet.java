package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String id=request.getParameter("oid");//get order id
	String PICloc=request.getParameter("oploc");//get pickup location 
	String DROloc=request.getParameter("oddlocc");//get drop location 
	String PICdat=request.getParameter("opdat");//get pickup date 
	String DROdat=request.getParameter("oddate");//get drop date 
	String TIme=request.getParameter("otimee");//get pickup time 
	
	
	boolean isTrue;
	
	isTrue=CustomerDBUtil.updatebooking(id, PICloc,DROloc, PICdat, DROdat, TIme);
	
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
