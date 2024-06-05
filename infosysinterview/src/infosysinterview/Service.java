package infosysinterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
	public static void main(String[] args) {
		
		 List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("John", 50000));
	        employees.add(new Employee("Alice", 60000));
	        employees.add(new Employee("Bob", 55000));
	        employees.add(new Employee("Emily", 70000));

	        // Filter and sort employees by descending salary
	        List<Employee> filteredEmployees = employees.stream()
	                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
	                .collect(Collectors.toList());

	        // Print the sorted employees
	        System.out.println("Employees sorted by descending salary:");
	        filteredEmployees.forEach(System.out::println);
	}

}
