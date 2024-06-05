package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProblemSolving {
	
	
	public static void main(String[] args) {
		String s="abc";
	
		
		boolean n = Character.isLowerCase(s.charAt(0));
		
		int[] ar={1,2,3};
		int[]arr=new int[3];
		int j=0;
		
		for(int i=ar.length-1;i>=0;i--)
		{
			arr[j]=ar[i];
			j++;
		}
		
		
		System.out.println("&&&&&&");
		System.out.println(Arrays.toString(arr));
		int max=0;
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			
		}
		System.out.println(max);
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		ll1.add(5);
		ll1.add(6);
		ll1.add(7);
		ll1.add(8);
		
		ll.addAll(ll1);
		System.out.println(ll);
		
		
		
		System.out.println(ll.size()/2);
		
		Integer middle = ll.get(ll.size()/2);
		System.out.println(middle);
		System.out.println("******");
		
		  List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
          myList.stream()
                .map(p -> String.valueOf(p)) // Convert integer to String
                .filter(p -> p.startsWith("1"))
                .forEach(System.out::println);
		
      	System.out.println("max*");
        
      	myList.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(System.out::println);
      	
      	myList.stream().max(Integer:: compare).get();
      	
      	System.out.println("******");
          
          List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
          myList1.stream()
                .findFirst()
                .ifPresent(System.out::println);
          System.out.println("******");
          List<Double> myListd = Arrays.asList(10.0,15.0,8.0,49.0);
          
          double x = myListd.stream().mapToDouble(Double::doubleValue).sum();
          System.out.println(x);
          
          System.out.println("Finding first non repeatitng character");
          
          String d="abcdabd";
          
          for(int i=0;i<=d.length()-1;i++)
          {
        	  
        	  if(d.indexOf(d.charAt(i), d.indexOf(d.charAt(i))+1) == -1)
        	  {
        		  System.out.println(d.charAt(i)+"is first non repeating character");
        		  break;
        	  }

          }

        	  
	}
	
	

}
