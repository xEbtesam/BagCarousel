package Imam.edu.sa.behaviour;

import Imam.edu.sa.simulator.Configuration;
import Imam.edu.sa.simulator.StatsCollector;

public abstract class Behaviour {

	
	protected  Configuration config;
	
	protected StatsCollector stats;



	
	public Behaviour(Configuration config,StatsCollector stats ) {
		this.config = config;
		this.stats = stats; 
		
	}
	
	public abstract void step();
	
	
}
