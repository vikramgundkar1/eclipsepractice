package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CapgInterview {
	
	static int l;
	int x=9;
	
	
	public static void main(String[] args) {
		CapgInterview c=new CapgInterview();
		
				
		List<String> list=new ArrayList<String>();
		list.add("Ajay");
		list.add("Ashok");
		list.add("Bala");
		list.add("Bhanu");
		list.add("Dhivya");
		list.add("Chandru");
		list.add("");
		list.add("Surya");
		list.add("Aparna");
		
		List<Integer> ilist=Arrays.asList(11,14,23,56,78,34,16,18,23);
							//m-> m+""
		ilist.stream().map(m-> String.valueOf(m)).filter(f->f.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);
		
	
//		Optional<String> l = list.stream().filter(p -> p.startsWith("A")).collect(Collectors);
//	
//		if(l.isPresent())
//		{
//			System.out.println(l);
//		}
		
		
		List<Double> ll=new ArrayList<Double>();
		ll.add(1.0);
		ll.add(3.0);
		ll.add(2.0);
		
		
		
		System.out.println("((((((");
		List<Integer> li=new ArrayList<Integer>();
		   int h = li.stream().map(n-> Double.valueOf(n).intValue()).mapToInt(Integer::intValue)
				.sum();
		   System.out.println(h);
		   double k = ll.stream().mapToDouble(Double::doubleValue).sum();
		   int p=(int) k;
		   
		   System.out.println(k);
		   System.out.println(p);
		   System.out.println(")))))))))");
	if(ll.contains(3.0))
	{
		System.out.println(ll.get(2));
	}
	
	System.out.println(ll);
	ListIterator lit=ll.listIterator();
	
	if(lit.hasNext())
	{	
		
		lit.add(4.0);
	}
	System.out.println(ll);

	ListIterator lit1=ll.listIterator();
	
	
	System.out.println(Math.sqrt(-4));
		
	
		
//	
	}

}
