package sample;

public class CreateThreadWithInterface implements Runnable {

	@Override
	public void run() {
		
		
		System.out.println("Thread is initiated");
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		CreateThreadWithInterface c=new CreateThreadWithInterface();
		
		
		Thread t=new Thread(c);
		t.start();
		
	}

}
