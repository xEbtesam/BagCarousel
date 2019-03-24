package Imam.edu.sa.simulator;

import java.util.ArrayList;

import Imam.edu.sa.behaviour.Behaviour;



public class DProblem {
	
	private int passengerNo;
	private int maxBag;
    private ArrayList<DPassenger> passengers = new ArrayList<DPassenger>();
	private int cLevel;
	private LuggageCarousel luggageCarousel;
	private Behaviour behaviour;
	
    // TODO to be read from setting file
	private long interArrivalTime; // In seconds
	private long timeToPassLevel; // In second
    

	public int getPassengerNo() {
		return passengerNo;
	}
	public void setPassengerNo(int passengerNo) {
		this.passengerNo = passengerNo;
	}
	public int getMaxBag() {
		return maxBag;
	}
	public void setMaxBag(int maxBag) {
		this.maxBag = maxBag;
	}
	public int getcLevel() {
		return cLevel;
	}
	public void setcLevel(int cLevel) {
		this.cLevel = cLevel;
	}
	public ArrayList<DPassenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(ArrayList<DPassenger> passengers) {
		this.passengers = passengers;
	}
	public LuggageCarousel getLuggageCarousel() {
		return luggageCarousel;
	}
	public void setLuggageCarousel(LuggageCarousel luggageCarousel) {
		this.luggageCarousel = luggageCarousel;
	}
	
	public Behaviour getBehaviour() {
		return behaviour;
	}
	public void setBehaviour(Behaviour behaviour) {
		this.behaviour = behaviour;
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
		return  "passengerNo "+ passengerNo + " maxBag " + maxBag+ "\npass"+ passengers.toString() + " \ncLevel "+cLevel;
	}

}
