package epam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Activity {
	
	
	public static void main(String[] args) {
	
		
		
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee("Vikram", "Mech",1997));
		list.add(new Employee("Vishal", "Mech",1998));
		list.add(new Employee("Omkar", "Mech",1997));
		list.add(new Employee("Rushi", "Mech",1999));
		list.add(new Employee("sharad", "Mech",2000));
		
		
		
		HashMap<Integer, List<Employee>> map=new HashMap<Integer, List<Employee>>();
		 
		for(Employee emp:list)
		{
			
			if(!map.containsKey(emp.getYear()))
			{
				map.put(emp.getYear(), new ArrayList<Employee>());
			}
			
				map.get(emp.getYear()).add(emp);
			
				
		}
		System.out.println(map);
		
		
		
//		for(int i=0; i<=list.size()-1;i++)
//		{
//		//	List<Employee> listbyyear = new ArrayList<Employee>();
//			
// 			map.put(list.get(i).getYear(), list.get(i));
//		}
		
		
		
	}

}
