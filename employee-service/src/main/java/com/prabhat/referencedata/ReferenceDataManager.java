package com.prabhat.referencedata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.prabhat.models.Employee;

@Component
public class ReferenceDataManager {

	public List<Employee> getEmployeeList(String serverPort) {
		List<Employee> employeeList = new ArrayList<Employee>();

		Employee employee1 = new Employee();
		employee1.setEmployeeId(100);
		employee1.setEmployeeName("Charan");
		employee1.setEmplyeeDepartment("Consulting");
		employee1.setServerPort(serverPort);
		Employee employee2 = new Employee();
		employee2.setEmployeeId(100);
		employee2.setEmployeeName("Charan");
		employee2.setEmplyeeDepartment("Consulting");
		employee2.setServerPort(serverPort);
		Employee employee3 = new Employee();
		employee3.setEmployeeId(100);
		employee3.setEmployeeName("Charan");
		employee3.setEmplyeeDepartment("Consulting");
		employee3.setServerPort(serverPort);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		return employeeList;

	}
}
