package demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	int x=10;
	static int y=8;
	private int id;
	private String name;
	
	
	public Student() {
		super();
	}


	@Override
	public String toString() {
		return "[ id=" + id + ", name=" + name + "]";
	}


	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		int z=11;
		
		
		//list.stream().filter(m->m%2!=0).map(n-> n*n).collec.(Collectors.toList());
		//How to sort a list of students on the basis of their First name?
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1,"Vikram"));
		list.add(new Student(2,"Ashok"));
		list.add(new Student(3,"Gundkar"));
		
		list.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList()).forEach(System.out::println);		
		
		
		//select AuthorName from Table group by authorName having count(Book)>10;
		
		String c="vikramAshokGundkar";
		String snake_case=null;
		for(int i=0;i<=c.length()-1;i++)
		{
			char p = c.charAt(i);
			String regax="([a-z])([A-Z]+)";
			String replace="$1_$2";
			 snake_case=c.replaceAll(regax, replace);
			
		}
		System.out.println(snake_case);
	
	}

}
