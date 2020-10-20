/**
 * 
 */
package com.micro.services.jv.entity;

/**
 * @author Admin
 *
 */
public class Employee {

	private Long id;
	private String name;
	private boolean sex;

	public Employee(Long id, String name, boolean sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

}
