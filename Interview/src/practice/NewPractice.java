 package practice;

import java.util.Collections;
import java.util.LinkedList;

public class NewPractice {
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
//
//	public boolean equals(Object o) {
//		if (o == null || getClass() != o.getClass()) {
//			return false;
//		}
//
//		if (o == this) {
//			return true;
//		}
//
//		NewPractice n = (NewPractice) o;
//
//		return this.getId() == n.getId();
//
//	}

//	public int hashcode(int id) {
//		return id;
//	}

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		Collections.sort(ll);
		

	}
	

	
	public boolean equals(Object o)
	{
		if(o==null || getClass()!=o.getClass())
			return false;
		
		if(o==this)
			return true;
		
		NewPractice c =(NewPractice) o;
			return this.getId()==c.getId();
		
	}
	
	public int hashcode(int id)
	{
		return (int) (id*0.123);
	}
	
	
	
	
	

}
