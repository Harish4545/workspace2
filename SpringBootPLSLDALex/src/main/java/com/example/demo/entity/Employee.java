package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empid;
	private String empname;
	private Double empsal;
	private String emploc;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(Double empsal) {
		this.empsal = empsal;
	}
	public String getEmploc() {
		return emploc;
	}
	public void setEmploc(String emploc) {
		this.emploc = emploc;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", emploc=" + emploc + "]";
	}
	public Employee(Integer empid, String empname, Double empsal, String emploc) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.emploc = emploc;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
