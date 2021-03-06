package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer proid;
	private String proname;
	private Double procost;
	
	
	public Integer getProid() {
		return proid;
	}
	public void setProid(Integer proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public Double getProcost() {
		return procost;
	}
	public void setProcost(Double procost) {
		this.procost = procost;
	}
	@Override
	public String toString() {
		return "Product [proid=" + proid + ", proname=" + proname + ", procost=" + procost + "]";
	}
	public Product(Integer proid, String proname, Double procost) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.procost = procost;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
