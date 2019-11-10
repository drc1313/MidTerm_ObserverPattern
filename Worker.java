package observer_pattern;

public class Worker {
	
	long workerID;
	
	Worker(long ID){
		workerID = ID;
	}
	
	public WorkItem notifyObserver(WorkItem I) {
		if(workerID != I.getItemID()) {
			return null;
		}
		
		I.setMessage(I.getMessage()+"Worker:"+workerID+" Was here ");
		
		System.out.println("Worker<"+workerID+"> processed WorkItem <"+I.getItemID()+"> message <"+I.getMessage()+">");
		
		I.incrementID();
		
		return I;
	}
}
