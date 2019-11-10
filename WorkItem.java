package observer_pattern;

public class WorkItem {

	private long ItemID;
	private long WorkerID;
	private String Message;
	
	public WorkItem(long i, long w, String m){
		ItemID = i;
		WorkerID = w;
		Message = m;		
	}
	
	public void incrementID() {
		ItemID++;
	}
	
	public long getWorkerID() {
		return WorkerID;
	}
	public void setWorkerID(long ID) {
		WorkerID = ID;
	}
	
	public long getItemID() {
		return ItemID;
	}
	
	public String getMessage() {
		return Message;
	}
	public void setMessage(String m) {
		Message = m;
	}
}
