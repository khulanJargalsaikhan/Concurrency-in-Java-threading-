package learningThreading;

public class Application {
	// Multithreading program
	

	public static void main(String[] args) {
		System.out.println("Starting Thread 1");
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i=0; i<1000; i++) {
					System.out.println("number: " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			
		});		thread1.start();
		
		System.out.println("Starting Thread 2");
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i=0; i<1000; i++) {
					System.out.println("number: " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			
		});
		thread2.start();
	}

}


