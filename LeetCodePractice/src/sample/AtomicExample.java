package sample;

public class AtomicExample implements Runnable {

	
	int count = 0;
	@Override
	    public void run() {
		
	        for (int i = 0; i < 1000; i++) {
	            count++;
	        }
	}

	public static void main(String[] args) {
		AtomicExample example = new AtomicExample();
		example.runTest();
	}

	public void runTest() {
//		Thread thread1 = new Thread(new CounterIncrementer());
//		Thread thread2 = new Thread(new CounterIncrementer());
		
		Thread thread1 = new Thread(new AtomicExample());
		Thread thread2 = new Thread(new AtomicExample());

		thread1.start();
		System.out.println("Final counter value: "+ count);
		
		thread2.start();
		System.out.println("Final counter value: "+ count);

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final counter value: "+ count);
	}

}
