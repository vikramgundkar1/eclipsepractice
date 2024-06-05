package demo;

public class Practice implements Comparable<Practice>{
	
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Practice( int age, String name) {
		super();
		this.name = name;
		this.age = age;
	}
	public Practice() {
		super();
	}
	@Override
	public String toString() {
		return "Practice [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Practice o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, o.age);
		 
	}
	
	
	
	
	
	

}
