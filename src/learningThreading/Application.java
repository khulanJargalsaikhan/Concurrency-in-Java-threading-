package learningThreading;

public class Application {

	public static void main(String[] args) {
		System.out.println("Starting Thread 1");
		Task taskRunner = new Task("Thread-A");
		taskRunner.start();
		
		System.out.println("Starting Thread 2");
		Task taskRunner2 = new Task("Thread-B");
		taskRunner2.setName("Thread B");
		taskRunner2.start();
	}

}






class Task extends Thread{
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(this.name);
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
	
}
