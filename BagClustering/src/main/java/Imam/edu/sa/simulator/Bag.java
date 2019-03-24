package Imam.edu.sa.simulator;

public class Bag {
	private long bagArrivalTime; // Time the bag enter the carousel
	private long bagReadyTime; // Time reach its destination 
	private String id;
	
	
	public Bag(String id) {
		this.id = id;
	}
	public long getBagArrivalTime() {
		return bagArrivalTime;
	}

	public void setBagArrivalTime(long bagArrivalTime) {
		this.bagArrivalTime = bagArrivalTime;
	}
	
	public String getId() {
		return id;
	}
	public long getBagReadyTime() {
		return bagReadyTime;
	}
	public void setBagReadyTime(long bagReadyTime) {
		this.bagReadyTime = bagReadyTime;
	}
}
