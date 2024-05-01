package com.customer;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class CustomerDBUtil {
	
	// get order details
	public static List<Order> gotorder(String idd){

		ArrayList<Order> ord =new ArrayList<>();	
		
	
		String url="jdbc:mysql://localhost:3306/neworder";
		String user="root";
		String pass ="Alex@20020226";
		
		
		
		//create database connection
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con =DriverManager.getConnection(url, user, pass);
			Statement stmt=con.createStatement();
			
			// Query to match the inserted value and return details
			String sql="select *from neworder.order where idorder='"+idd+"'";
			ResultSet rs =stmt.executeQuery(sql);
		
			if(rs.next()) {
				int nid =rs.getInt(1);
				String picloc=rs.getString(2);
				String droloc= rs.getString(3);
				String picdate = rs.getString(4);
				String dropdate= rs.getString(5);
				String VsizE=rs.getString(6);
				
				Order o=new Order(nid,picloc,droloc,picdate,dropdate,VsizE);//create object for class Order
				ord.add(o);
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ord;
		
		
		}
	//validate vehicle
	public static List<Customer> validate(String aloc,String adate){

	ArrayList<Customer> cus =new ArrayList<>();	
	
	//create database connection
	String url="jdbc:mysql://localhost:3306/neworder";
	String user="root";
	String pass ="Alex@20020226";
	
	
	
	//validate
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con =DriverManager.getConnection(url, user, pass);
		Statement stmt=con.createStatement();
		//select matched vehicle details
		String sql="select * from neworder.vtable where availableloc ='"+aloc+"' and availabledate ='"+adate+"'";
		ResultSet rs =stmt.executeQuery(sql);
	
		
		//check the return value from rs
		if(rs.next()) {
			int id =rs.getInt(1);
			String nameV=rs.getString(2);
			String numV= rs.getString(3);
			String locA = rs.getString(4);
			String dateA= rs.getString(5);
			String sizE=rs.getString(6);
			
			Customer c=new Customer(id,nameV,numV,locA,dateA,sizE);//create object for Customer class
			cus.add(c);
		}
	
	}
	catch(Exception e) {
		e.printStackTrace(); //throwing exception
	}
	return cus;
	
	
	}
	//insert
	public static boolean insertcustomer(String pLoc,String dLoc,String pdat,String ddat,String ptime) {
		boolean isSuccess=false;
	
		//create database connection
		String url="jdbc:mysql://localhost:3306/neworder";
		String user="root";
		String pass ="Alex@20020226";
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con =DriverManager.getConnection(url, user, pass);
			Statement stmt=con.createStatement();
			//insert
			String sql="INSERT INTO neworder.order VALUES(0,'"+pLoc+"','"+dLoc+"','"+pdat+"','"+ddat+"','"+ptime+"')";
			int rs=stmt.executeUpdate(sql);
			
			//check the return value from rs
			if(rs>0){
				isSuccess=true;	
			}
			else {
				isSuccess=false;
			}
				
		}
		catch(Exception e) {
			e.printStackTrace(); //throwing exception
			
		}
		return isSuccess;
		
	}
	
	
	//update booking
	public static boolean updatebooking(String id,String piloc,String drloc,String pidate,String drodate,String vtime) {
		
		boolean isSuccess=false;
		
		
		//create database connection
				String url="jdbc:mysql://localhost:3306/neworder";
				String user="root";
				String pass ="Alex@20020226";
				
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection(url, user, pass);
			Statement stmt=con.createStatement();
			//update 
			String sql="UPDATE neworder.order set picklocation='"+piloc+"',droplocation='"+drloc+"',pickdate='"+pidate+"',dropdate='"+drodate+"',time='"+vtime+"'"+"where idorder='"+id+"'";
			int rs=stmt.executeUpdate(sql);
		
			//check the return value from rs
																			
			if(rs>0){
				isSuccess=true;	
			}
			else {
				isSuccess=false;
			}
			
		}
		catch(Exception e) {
		 e.printStackTrace();  //throwing exception
		}
		
		return isSuccess;
		
		}
	
	//cancel order
	
public static boolean cancelbooking(String id) {
		
		boolean isSuccess=false;
		
		
		//create database connection
				String url="jdbc:mysql://localhost:3306/neworder";
				String user="root";
				String pass ="Alex@20020226";
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con =DriverManager.getConnection(url, user, pass);
			Statement stmt=con.createStatement();
			String sql="DELETE FROM neworder.order WHERE idorder='"+id+"'";
			int rs=stmt.executeUpdate(sql);
		
			//check the return value from rs																
			if(rs>0){
				isSuccess=true;	
			}
			else {
				isSuccess=false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace(); //throwing exception
		}
		
		return isSuccess;
		
		}
}
