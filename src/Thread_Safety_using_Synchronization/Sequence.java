package Thread_Safety_using_Synchronization;

public class Sequence {
	
	private int value = 0;
	
	// All or Nothing
	// Defining synchronized --> Entire line or method run completely (Thread safe)
	public synchronized int getNext() {
		value++;
		return value;
	}

}
