/**
 * 
 */
package com.micro.services.jv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.micro.services.jv.entity.Department;

/**
 * @author Admin
 *
 */

@RestController
@RequestMapping("/")
public class DepartmentController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private Environment environment;

	@GetMapping("/heal-check")
	public ResponseEntity<?> healCheck() {
		String message = "This is a message for heal check with server name "
				+ environment.getProperty("spring.application.name");
		return ResponseEntity.ok(message);
	}

	@GetMapping("/department/{id}")
	public ResponseEntity<?> getGallery(@PathVariable final long id) {
		// create department object
		Department department = new Department();
		department.setId(id);

		// get list of available employees
		@SuppressWarnings("unchecked")
		List<Object> employees = restTemplate.getForObject("http://employee-service/employees/", List.class);
		department.setEmployees(employees);

		return ResponseEntity.ok(department);
	}


}
