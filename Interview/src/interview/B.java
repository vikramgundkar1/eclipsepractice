package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B extends A {
	
	 public void m1()
	{
		System.out.println("m1 from B");
	}
	public void m3()
	{
		System.out.println("m3 from B");
	}

	
	public static void main(String[] args) {
		
		A a= new B();
		a.m1();
		
		
		A a1=new A();
		a1.m1();
		
	B b = new B();
	

	
	TreeSet t=new TreeSet();
	
//	t.add(4);
//	t.add(1);
//	t.add(2);
	
//	t.add(null);
	System.out.println(t);
	
	HashSet hs=new HashSet();
	hs.add(2);
	hs.add(1);
	
	System.out.println(hs);
	List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	
	myList.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(System.out::println);
	
	System.out.println(myList.stream().min(Integer::compare).get());
	
	
	List<String> list1 = Arrays.asList("Java", "8");
    List<String> list2 = Arrays.asList("explained", "through", "programs");
    List<List<String>> flist=new ArrayList<List<String>>();
    List<String> j = Stream.of(list1,list2).flatMap(List::stream).collect(Collectors.toList());
    System.out.println(j);
    flist.add(list1);
    flist.add(list2);
    
    
    List<String> h = flist.stream().flatMap(List::stream).collect(Collectors.toList());
    
    System.out.println(h);
    

    Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
    concatStream.forEach(System.out::println);
    
    
    
    List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
    Map<String,Long> namesCount = names
                                 .stream()
                     .collect(Collectors.groupingBy
                     (Function.identity(), Collectors.counting()));
    System.out.println(namesCount);
    
    
    
    
    
    
    
    
    
	
	}
	
	
	
	

}
