package today;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Implementation {

	public static void main(String[] args) {
		
		
		List<Employee> e=new ArrayList <Employee>();
		
		e.add(new Employee(1,"Vikram", 120000));
		e.add(new Employee(2,"Vishal", 10000));
		
		e.stream().sorted((o1,o2)-> (o2.geteName().compareTo(o1.geteName()))).collect(Collectors.toList()).forEach(System.out::println);
		
		
		e.stream()
        .filter(employee -> employee.geteName().startsWith("V"))
        .collect(Collectors.toList())
        .forEach(System.out::println);
		
//		e.stream().forEach(z-> System.out.println(z));
//		
//		System.out.println("_____");
//		
//		
//		
//		
//		e.stream().collect(Collectors.toList()).forEach(f-> {
//			System.out.println(f.geteName());
//			System.out.println(f.getId());
//			System.out.println(f.getSalary());
//		});
//		
	}
}
