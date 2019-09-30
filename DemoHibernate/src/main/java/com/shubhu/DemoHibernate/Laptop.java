package com.shubhu.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	int id;
	String company;
	
//	public emp getStudent() {
//		return student;
//	}
//	public void setStudent(emp student) {
//		this.student = student;
//	}
//	@ManyToOne
//	private emp student;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", company=" + company + "]";
	}
}
