package epam;

public class LoadBalancer {
	
	
	

	public static void main(String[] args) {
		
		
		
		LoadBalancer lb=new LoadBalancer();
		lb.addsomething("url1");
		lb.addsomething("url2");
		lb.addsomething("url3");
		
		System.out.println(lb.next());
		System.out.println(lb.next());
		System.out.println(lb.next());
		System.out.println(lb.next());
		
		
		/*op should be
		 * url1
		 * url2
		 * url3
		 * url1
		
		
		*/
	}

	
}
