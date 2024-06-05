package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeCompareToInSream {
	
	
	int id;
	String name;
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
	public PracticeCompareToInSream(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	public PracticeCompareToInSream() {
		super();
	}
	
	
	
	public static void main(String[] args) {
		List<PracticeCompareToInSream> list=new ArrayList<PracticeCompareToInSream>();
		list.add(new PracticeCompareToInSream(1,"vikram"));
		list.add(new PracticeCompareToInSream(2,"ashok"));
		list.add(new PracticeCompareToInSream(3,"gundkar"));
		
		
	 list.stream().sorted((o1,o2)-> o2.getName().compareTo(o1.getName())).collect(Collectors.toList()).forEach(System.out::println);;
		//System.out.println(sortedList);
		
	}

}
