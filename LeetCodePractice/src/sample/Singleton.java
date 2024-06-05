package sample;


//Thread safe singletone using double check locking
public class Singleton {
	
	
	
	private static Singleton instance;

	private  Singleton() {
		
	}
	
	public Singleton createInstance()
	{
		
		if(instance==null)
		{
			
			synchronized (Singleton.class){
				if(instance==null)
				{

					instance= new Singleton();
				}
			}
			
			
		}
		
		
		
		return instance;
	}
	

}
