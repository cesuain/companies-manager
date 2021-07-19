package br.com.alura.companiesmanager.model;

import java.util.Date;

public class Company {

	private Integer id;
	private String name;
	private String headquarter;
	private Date founded = new Date();
	private String employees;
		
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadquarter() {
		return headquarter;
	}
	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}
	public Date getFounded() {
		return founded;
	}
	public void setFounded(Date founded) {
		this.founded = founded;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	
}
