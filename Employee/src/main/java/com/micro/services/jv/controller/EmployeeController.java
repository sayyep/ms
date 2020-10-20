/**
 * 
 */
package com.micro.services.jv.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.services.jv.entity.Employee;

/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	private Environment environment;

	@GetMapping("/heal-check")
	public ResponseEntity<?> healCheck() {
		String message = "This is a message for heal check with server name "
				+ environment.getProperty("spring.application.name");
		return ResponseEntity.ok(message);
	}

	@RequestMapping("/employees")
	public ResponseEntity<?> getEmployees() {
		List<Employee> employees = Arrays.asList(new Employee(1L, "name1", true), new Employee(2L, "name2", true),
				new Employee(3L, "name3", true));
		return ResponseEntity.ok(employees);
	}

}
