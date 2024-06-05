package epam;

public class Employee {
	
	String name;
	String department;
	int year;
	
	
	public Employee(String name, String department, int year) {
		super();
		this.name = name;
		this.department = department;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", department=" + department + ", year=" + year + "]";
	}
	
	
	

}
