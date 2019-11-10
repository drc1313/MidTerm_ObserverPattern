package observer_pattern;

public class Main {

	public static void main(String args[]) {
		
		WorkManager mang = new WorkManager();
		mang.registerObserver(new Worker(1));
		mang.registerObserver(new Worker(2));
		mang.registerObserver(new Worker(3));
		mang.registerObserver(new Worker(4));
		
		WorkItem Item1 = new WorkItem(1, 1, "Item1Status: ");		
		mang.notifyObservers(Item1);
		System.out.println('\n');
		
		WorkItem Item2 = new WorkItem(3, 1, "Item2Status: ");
		mang.notifyObservers(Item2);
		System.out.println('\n');

		WorkItem Item3 = new WorkItem(5, 1, "Item3Status: ");
		mang.notifyObservers(Item3);

		System.out.println("Done");

	}
	
}
