package com.prabhat.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prabhat.models.Employee;
import com.prabhat.referencedata.ReferenceDataManager;

@RestController
@RefreshScope
public class EmployeeController {
	
	@Value("${server.port}")
	String serverPort;
	
	@Value("${emp.name}")
	String empNameRefresh;
	
	private static Logger loggger = Logger.getLogger(EmployeeController.class.getName());
	
	@Autowired
	ReferenceDataManager referenceDataManager;
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		loggger.log(Level.ALL,"Request hit at port: " + serverPort);
		return referenceDataManager.getEmployeeList(serverPort);
	}
	
	@GetMapping("/testRefresh")
	public String testRefresh(){
		return empNameRefresh;
	}
}
