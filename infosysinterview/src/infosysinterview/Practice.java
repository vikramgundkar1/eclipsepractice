package infosysinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		
		for(int i=0;i<=list.size()-1;i++)
		{
			if(!map.containsKey(list.get(i)))
			{
				map.put(list.get(i), 1);
			}
			else
			{
				map.put(list.get(i), map.get(i)+1);
			}
			
			
		}
		System.out.println(map);
		
		
		
		Map<Integer, Long> m = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(m);
		
		
		
	}

}
