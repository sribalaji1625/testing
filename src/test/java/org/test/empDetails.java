package org.test;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class empDetails {
	private List<Employee1> employee1;

	public List<Employee1> getEmployee1() {
		return employee1;
	}

	public void setEmployee1(List<Employee1> employee1) {
		this.employee1 = employee1;
	}
	

}
