package com.shubhu.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cache;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Student")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)

public class emp {
	
	@Id
	int id;
	empName name;
	
//	@OneToMany(mappedBy="student")
//	private List<Laptop> laptop= new ArrayList<>();
	
//	public List<Laptop> getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(List<Laptop> laptop) {
//		this.laptop = laptop;
//	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public empName getName() {
		return name;
	}
	public void setName(empName name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + "]";
	}
	

}
