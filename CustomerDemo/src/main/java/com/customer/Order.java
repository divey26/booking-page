package com.customer;

public class Order {

	private int vid;
	private String pploc;
	private String ddloc;
	private String ppdat;
	private String dddate;
	private String ssize;
	
	public Order(int vid, String pploc, String ddloc, String ppdat, String dddate, String ssize) {

		
		this.vid = vid;
		this.pploc = pploc;
		this.ddloc = ddloc;
		this.ppdat = ppdat;
		this.dddate = dddate;
		this.ssize = ssize;
	}

	public int getVid() {
		return vid;
	}

	public String getPploc() {
		return pploc;
	}

	public String getDdloc() {
		return ddloc;
	}

	public String getPpdat() {
		return ppdat;
	}

	public String getDddate() {
		return dddate;
	}

	public String getSsize() {
		return ssize;
	}

	
	
	

}
