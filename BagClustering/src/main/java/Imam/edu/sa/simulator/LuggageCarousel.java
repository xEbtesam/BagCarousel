package Imam.edu.sa.simulator;

import java.util.ArrayList;

public class LuggageCarousel {

    private ArrayList<Bag> bagsQ = new ArrayList<Bag>();
	private int systemLevel;
	private int existPoint;
	private int numOfbag; // number of bag currently on the carousel

	public LuggageCarousel() {
	
	} 
	public LuggageCarousel(int systemLevel) {
		this.systemLevel = systemLevel;
		this.existPoint = systemLevel; // How many exist point do we have ? is it the same as systemLvel
		
	}
	public int getSystemLevel() {
		return systemLevel;
	}
	public void setSystemLevel(int pathNo) {
		this.systemLevel = pathNo;
	}
	public int getExistPoint() {
		return existPoint;
	}
	public void setExistPoint(int existPoint) {
		this.existPoint = existPoint;
	}
	public ArrayList<Bag> getBagsQ() {
		return bagsQ;
	}
	public void setBagsQ(ArrayList<Bag> bagsQ) {
		this.bagsQ = bagsQ;
	}
	public void addBags(String passengerName, int luggageNo) {
		Bag bag = new Bag(passengerName);
		for (int i = 0; i < luggageNo; i++)
			bagsQ.add(bag);
	}
	public int getNumOfbag() {
		return numOfbag;
	}
	public void setNumOfbag(int numOfbag) {
		this.numOfbag = numOfbag;
	}	

}
