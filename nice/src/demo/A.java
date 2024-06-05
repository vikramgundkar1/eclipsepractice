package demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
	
	
	
	
	

    Integer num = 10;

    public void display() throws FileNotFoundException {

        System.out.println("In Parent class");
    }
    
    public static void main(String[] args) {
    	
    	List<Practice> plist=new ArrayList<Practice>();
    	List<Practice> mlist=new ArrayList<Practice>();
    	plist.add(new Practice(1,"Vikram"));
    	plist.add(new Practice(411,"Ashok"));
    	plist.add(new Practice(3,"Gundkar"));
    	plist.add(new Practice(411,"Dada"));
    	
    	
    	
    	long count = plist.stream().filter(t->t.getAge()>5).count();
    	System.out.println(count);
    	 	
    	
    	List<Integer> li=Arrays.asList(1,5,3,8,5,8,3);
    	li.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    	
    	li.stream().sorted(Comparator.naturalOrder());
    	li.stream().sorted(Comparator.reverseOrder());
    	li.stream().max(Integer::compare);
//    	System.out.println("---");
//    	li.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println); 
//    	System.out.println("---");
//    	li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//    	System.out.println("---");
    	
//    	plist.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);
//    	System.out.println("IIIIII");  	
//    	
    	plist.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    	System.out.println("IIIIII");  
    	
//    	plist.stream().sorted(Comparator.comparing(Practice::getName).reversed()).collect(Collectors.toList()).forEach(System.out::println);
//    	System.out.println("))))");
//    	Optional<Integer> max = plist.stream().map(m->m.getAge()).max(Integer::compare);
//    	if(max.isPresent())
//    	{
//    		plist.stream().filter(g->g.age==max.get()).collect(Collectors.toList()).forEach(System.out::println);
//    	}
//    	else
//    	{
//    		System.out.println("There is now elements in list");
//    	}
//    	
    	
  // Remove Duplicates from Array
    	
    	int arr[]= {1,2,3,11,5,2,4,7,3,1,9};
    	System.out.println(Arrays.toString(arr));
    	
    	HashSet<Integer> hs=new HashSet();
    	
    	for(int i=0;i<=arr.length-1;i++)
    	{
    		if(!hs.contains(arr[i]))
    		{
    			hs.add(i);
    		}
    	}
    	
    	System.out.println(hs);
    	
  //  	Factorial Calculation
    	int res=1;
    	for(int i=4;i>=1;i--)
    	{
    		res=res*i;
    	}
    	System.out.println(res);
 //Merge Two Sorted Arrays
    	
    	int arr3[]= {1,2,3,4};
    	int arr4[]= {5,6,7,8};
    
    	List<Integer> list3=new ArrayList();
    	List<Integer> list4=new ArrayList();
    	list3.add(3);
    	list4.add(4);
    	
    	Stream.of(arr3,arr4).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList()).forEach(System.out::println);
    	
    	Stream.of(list3,list4).flatMap(List::stream).collect(Collectors.toList()).forEach(System.out::println);
    
    	
 //Anagram Check
    	
    	
    	
    	
    	
    	
    	List<String> sortedString= new ArrayList<String>();
    	
    	List<ArrayList<String>> llstring=new ArrayList<ArrayList<String>>();
    	
    	StringBuilder sb=new StringBuilder();
    	
    	for(int i=0;i<=lstring.size()-1;i++)
    	{
    		String actualString = lstring.get(i);
    		char[] arrp = actualString.toCharArray();
    		Arrays.sort(arrp );
    		sortedString.add(String.valueOf(arrp));		
    		   		
    	}
    	
    	HashMap<String, Integer> map=new HashMap<String, Integer>();
    	for(int i=0;i<=sortedString.size()-1;i++)
    	{
    		if(!map.containsKey(sortedString.get(i)))
    				{
    					map.put(sortedString.get(i), 1);
    				}
    		
    		else
    		{
    			map.put(sortedString.get(i), map.get(sortedString.get(i))+1);
    		}
    		
    	}
    	
    	System.out.println(map);
    	
    	
    	
    	
    	
  
    	
    	
    	
    	
    	
    	
    	if(ss1.length()==0 || ss2.length()== 0 || ss1.length()!=ss2.length())
    	{
    		System.out.println("input valid String");
    	}
    	else {
    		
    		
    		char[] chararr1 = ss1.toCharArray();
    		char[] chararr2 = ss2.toCharArray();
    		
    		Arrays.sort(chararr1);
    		Arrays.sort(chararr2);
    		
    		  boolean result = Arrays.equals(chararr1, chararr2);
    		  System.out.println(result);
    		if(result==true)
    		{
    			System.out.println("Given Strings are anagram");
    		}
    		
    	}
    }

	

}


	