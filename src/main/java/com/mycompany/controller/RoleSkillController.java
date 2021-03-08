package com.mycompany.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.entity.EmployeeRoleSkill;

@RestController
public class RoleSkillController {

	@GetMapping("/empRoleSkill/{empId}")
	public EmployeeRoleSkill getEmployeeRoleSkill(@PathVariable String empId) {
		return new EmployeeRoleSkill(empId, "Role_Arch_J", "Java");
		// Refine code to talk to database
	}
}
