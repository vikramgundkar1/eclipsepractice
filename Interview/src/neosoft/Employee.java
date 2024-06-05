package neosoft;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	int id;
	String name;
	String designation;	
	List<Address> address;
		
	public Employee() {
		super();
	}

	public Employee(String name, String designation, List<Address> address) {
		super();
		this.name = name;
		this.designation = designation;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", address=" + address + "]";
	}

}
