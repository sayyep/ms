/**
 * 
 */
package com.micro.services.jv.entity;

import java.util.List;

/**
 * @author Admin
 *
 */
public class Department {

	private Long id;
	private List<Object> employees;
	
	public Department() {
	}

	public Department(Long id, List<Object> employees) {
		super();
		this.id = id;
		this.employees = employees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Object> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Object> employees) {
		this.employees = employees;
	}

}
