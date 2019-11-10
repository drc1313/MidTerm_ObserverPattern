package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class WorkManager {
	
	List<Worker> workerList = new ArrayList<Worker>();
	
	public void registerObserver(Worker worker) {
		workerList.add(worker);
	};
	
	public void removeObserver(Worker worker) {
		workerList.remove(worker);
	};
	
	public void notifyObservers(WorkItem I) {
		
		while(I.getItemID()<4) {		
			for(Worker worker : workerList) {
				WorkItem result = worker.notifyObserver(I);
				if(result!=null) {
					System.out.println(worker.workerID+":Completed work on WorkItem<"+I.getItemID()+">");
				}
				
			}
		}
		
		
	};
	
}
