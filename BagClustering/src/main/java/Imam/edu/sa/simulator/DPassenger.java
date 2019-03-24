package Imam.edu.sa.simulator;

import com.github.javafaker.Faker;

public class DPassenger {
	
	// from generator
	private String passengerName;
	private int luggageNo; // Total number of bags checked in
	private int groupRound; // How many round it takes
	private int collectionPoint ;
	private int luggageOut; // Counter to calculate number of bag reached its end point
	private boolean bagsReady; // all items are ready
	private int currentRound; 
	private boolean passengerReady; // passenger is ready
	private boolean dispense; // All conditions  have met bags and passenger
	private double dispenseTime; // Completion time
	private double lastBagArriveTime; // The last bag arrived time
	

	// from simulator setting file
    private long interArrivalTime = 6; // In seconds
    private long timeToPassLevel = 20; // In second
	
	Faker faker = new Faker(); 

	// needed for mapping 
	public DPassenger() {
		
	}
	public DPassenger(int bcLevel, int luggageNo) {

		setPassengerName(faker.name().lastName()); 
		
		setLuggageNo(luggageNo); // set luggage number
		//System.out.println("Passenger Name "+this.getPassengerName()+" Group Round "+this.getGroupRound()+" Collection Point "+this.getCollectionPoint());
	}

	public int getLuggageNo() {
		return luggageNo;
	}

	public void setLuggageNo(int luggageNo) {
		this.luggageNo = luggageNo;
	}

	public int getGroupRound() {
		return groupRound;
	}

	public void setGroupRound(int groupRound) {
		this.groupRound = groupRound;
	}

	public int getCollectionPoint() {
		return collectionPoint;
	}

	public void setCollectionPoint(int collectionPoint) {
		this.collectionPoint = collectionPoint;
	}

	public int getLuggageOut() {
		return luggageOut;
	}

	public void setLuggageOut(int luggageOut) {
		this.luggageOut = luggageOut;
	}

	public boolean getBagsReady() {
		return bagsReady;
	}

	public void setBagsReady(boolean isReady) {
		this.bagsReady = isReady;
	}

	public int getCurrentRound() {
		return currentRound;
	}

	public void setCurrentRound(int currentRound) {
		this.currentRound = currentRound;
	}

	public boolean isDispense() {
		return dispense;
	}

	public void setDispense(boolean dispense) {
		this.dispense = dispense;
	} 

	public boolean isPassengerReady() {
		return passengerReady;
	}

	public void setPassengerReady(boolean passengerReady) {
		this.passengerReady = passengerReady;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	public double getDispenseTime() {
		return dispenseTime;
	}

	public void setDispenseTime(double dis) {
		this.dispenseTime = dis;
	}

	public double getLastBagArrivalTime() {
		return lastBagArriveTime;
	}

	public void setLastBagArriveTime(double lastBagArriveTime) {
		this.lastBagArriveTime = lastBagArriveTime;
	}
	public long getInterArrivalTime() {
		return interArrivalTime;
	}
	public void setInterArrivalTime(long interArrivalTime) {
		this.interArrivalTime = interArrivalTime;
	}
	public long getTimeToPassLevel() {
		return timeToPassLevel;
	}
	public void setTimeToPassLevel(long timeToPassLevel) {
		this.timeToPassLevel = timeToPassLevel;
	}

	public String toString() {
		return 	" passengerName " + passengerName + " luggageNo " + luggageNo + " groupRound " + groupRound +
		" collectionPoint "+collectionPoint + " luggageOut " + luggageOut + " bagsReady "+ bagsReady + 
		" currentRound " +currentRound + " passengerReady " +passengerReady + " dispense " + dispense +"\n";
	}


}
