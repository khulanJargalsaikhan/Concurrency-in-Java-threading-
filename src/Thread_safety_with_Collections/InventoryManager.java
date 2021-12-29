package Thread_safety_with_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
	
	// this is thread safe --> concurrent collection
	List<Product> soldProductsList = new CopyOnWriteArrayList<>();
	
	// this is not thread safe. Use Thread.join() 
	List<Product> purchaseProductList = new ArrayList<>();
	
	
	public void populateSoldProduct() {
		for(int i=0; i<1000; i++) {
			Product prod = new Product(i, "test_product_" + i);
			soldProductsList.add(prod);
			System.out.println("ADDED: " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProducts() {
		for (Product product : soldProductsList) {
			System.out.println("PRINTING THE SOLD: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
