package practice;

public class Practice2 {
	
	
	

	public static void main(String[] args) {
		
		
		
		
		System.out.println("Executed main method");
		try {
			int a,b;
			a=10;
			b=0;
			int c=a/b;
		}
		catch(Exception e)
		{
			throw new NullPointerExceptionPractice("This is not valid");
		}
		System.out.println("Executed main method after catch");
	}
	
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(5);
//		list.add(1);
//		list.add(7);
//		list.add(7);
//		list.add(2);
//		list.add(7);
//
//		System.out.println(list.get(0));
//
//		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//		System.out.println(hm.get(0));
//
//		for (int i = 0; i <= list.size() - 1; i++) {
//			if (list.get(i) % 2 != 0) {
//
//				if (!hm.containsKey(list.get(i))) {
//					hm.put(list.get(i), 1);
//				} else {
//					hm.put(list.get(i), hm.get(i) + 1);
//				}
//
//			} else {
//				System.out.println(list.get(i) + " is a even number");
//			}
//
//		}
//		System.out.println(hm);
//	}
//	
	
	
	
	
	
	
	

}
