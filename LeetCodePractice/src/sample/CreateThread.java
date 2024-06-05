package sample;

public class CreateThread extends Thread{
	
	
	public void run()
	{
		System.out.println("Thread initiated");
	}
	
	public static void main(String[] args) {
		
		CreateThread t=new CreateThread();
		t.start();
		System.out.println(t.getPriority());
		
		t.setName("MyThread");
		System.out.println(t.getName());
	}

}
