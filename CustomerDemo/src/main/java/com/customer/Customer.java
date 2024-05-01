package com.customer;

public class Customer {
	
	
	private int vid;
	private String vname;
	private String vnum;
	private String aloc;
	private String adate;
	private String size;
	
	
	public Customer(int vid, String vname, String vnum, String aloc, String adate, String size) {
		
		this.vid = vid;
		this.vname = vname;
		this.vnum = vnum;
		this.aloc = aloc;
		this.adate = adate;
		this.size = size;
	}


	public int getVid() {
		return vid;
	}


	public String getVname() {
		return vname;
	}


	public String getVnum() {
		return vnum;
	}


	public String getAloc() {
		return aloc;
	}


	public String getAdate() {
		return adate;
	}


	public String getSize() {
		return size;
	}


	
		

}
