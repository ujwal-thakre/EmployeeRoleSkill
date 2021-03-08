package com.mycompany.entity;

public class EmployeeRoleSkill {

	private String empId;
	private String role;
	private String primarySkill;

	public EmployeeRoleSkill() {

	}

	public EmployeeRoleSkill(String empId, String role, String primarySkill) {
		super();
		this.empId = empId;
		this.role = role;
		this.primarySkill = primarySkill;
	}
}
