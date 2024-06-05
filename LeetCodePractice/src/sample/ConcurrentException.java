package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentException {
	
	public static void main(String[] args) {
List<Integer> list=new ArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        if(list.contains(6))
        {
        	list.remove(list.indexOf(6));
        }
        System.out.println(list);
        Collections.synchronizedList(list);
        Iterator<Integer> it=list.iterator();
        		while(it.hasNext())
        		{
        			int value =  it.next();
        			
        			
        		}
        		
        		System.out.println(it);
		
		
		
		
		
		  // Create a HashMap and populate it with some values
        Map<String, String> map = new HashMap<>();
        
        Collections.synchronizedMap(map);		
		
      // ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");

        // Get the iterator from the entry set of the map
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            //map.put("4", "Four");
            
            // Modify the map while iterating (this will throw ConcurrentModificationException)
//            if ("2".equals(entry.getKey())) {
//                map.put("4", "Four");
//            }
            
            int arr[]= {4,6,3,2,1,5};
            System.out.println(Arrays.toString(arr));
            for(int i=0;i<=arr.length-1;i++)
            {
            	for(int j=0;j<arr.length-1-i;j++)
            	{
            		if(arr[j]>arr[j+1])
            		{
            			int temp=arr[j];
            			arr[j]=arr[j+1];
            			arr[j+1]=temp;
            			
            		}
            	}
            }
            System.out.println(Arrays.toString(arr));
            
            
        }
        
        
        
        
        
        
        
	}

}
