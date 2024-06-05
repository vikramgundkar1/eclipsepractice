 package neosoft;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Output {

	public static void main(String[] args) throws IOException {
		
		
		List<Employee> ll=new ArrayList<>();
		
		
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		Map<Integer, Long> h = myList.stream().filter(x-> Collections.frequency(myList, x)>=2).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(h);
		
		Map<Integer, Long> f = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(f);
		
		
		Optional<Integer> max = myList.stream().max((a,b)-> a.compareTo(b));
		if(max.isPresent())
		{
			System.out.println("Max is"+max.get());
		}
		else
		{
			System.out.println("Max not present");
		}
		
		
		String t="VikramAshokGundkar";
		
		for(int i=0;i<=t.length()-1;i++)
		{
			if(t.indexOf(t.charAt(i), t.indexOf(t.charAt(i))+1) != -1)
			{
				System.out.println(t.charAt(i)+"Is the first  repeating index");
				break;
			}

		}
		

		List<Employee> em = new ArrayList<Employee>();
		List<Address> ad1 = new ArrayList<Address>();
		List<Address> ad2 = new ArrayList<Address>();

		Address address1 = new Address("Main Road", "Grampanchayat", "Sangli", 123456, "permanent");
		Address address2 = new Address("offset Road", "Grampanchayat", "Sangli", 123456, "temporary");
		System.out.println("555555555555555555");
		System.out.println(address1.toString());
		try {
			FileOutputStream fos=new FileOutputStream("data.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);		
			oos.writeObject(address1);
			System.out.println(address1.toString());
			System.out.println("Converted into byte code");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("IUJMGFMKGFYHKMHYGJTGDMGDUHJGCCMHGG");
		try {
			FileInputStream fis=new FileInputStream("data.ser");
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			Address thisobject = (Address) ois.readObject();
			
			System.out.println("Converted back to Address Object");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(address1.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ad1.add(address1);
		ad2.add(address2);

		Employee em1 = new Employee("Vikram", "Developer", ad1);
		Employee em2 = new Employee("Omkar", "Developer", ad2);
		
		
		
		em.add(em1);
		em.add(em2);
		
		System.out.println("____________");
		System.out.println(em);
		System.out.println(ad1);
		
		System.out.println("*************");

		List<Employee> s = em.stream().filter(e -> e.getDesignation().equals("Developer") && e.getName().equals("Vikram")).collect(Collectors.toList());
		System.out.println("777777");
		System.out.println(s);
		em.stream().map(Employee::getDesignation).forEach(System.out::println);
		System.out.println("777777");
		
		System.out.println("&&&&&&&&&");
		s.forEach(System.out::println);
		System.out.println("&&&&&&&&&");
		System.out.println("__________");
		s.forEach(e -> {
			System.out.println(e.getName());
			System.out.println(e.getDesignation());

			List<Address> p = e.getAddress();
			p.forEach(a -> {

				System.out.println(a.getStrretName());
				System.out.println(a.getArea());
				System.out.println(a.getPicCode());
				System.out.println(a.getDistrict());
				System.out.println(a.getType());

			});
		}

		);
		System.out.println("&&&&&&&&&");
		
		System.out.println(ad1);
		
		
		
		
		
		

	}
		
	
	
}
