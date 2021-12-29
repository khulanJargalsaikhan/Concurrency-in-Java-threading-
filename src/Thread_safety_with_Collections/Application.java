package Thread_safety_with_Collections;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		InventoryManager manager = new InventoryManager();
		
		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.populateSoldProduct();
			}
		});
		
		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.displaySoldProducts();
				
			}
		});
		
		inventoryTask.start();
		//inventoryTask.join(); // joins the main thread
		
		Thread.sleep(2000);
		displayTask.start();

	}

}
