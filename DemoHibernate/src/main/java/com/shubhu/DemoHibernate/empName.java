package com.shubhu.DemoHibernate;

import javax.persistence.Embeddable;

@Embeddable
public class empName {

	
	String fname;
	String mname;
	String lname;
	@Override
	public String toString() {
		return "empName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
