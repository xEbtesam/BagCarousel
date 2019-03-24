package Imam.edu.sa.simulator;

import java.util.Collections;

import Imam.edu.sa.behaviour.ClusteringBehaviour;
import Imam.edu.sa.behaviour.RegularBehaviour;



public class Simulator {
	
	
	private final Configuration config;
	private StatsCollector stats;


    

    /**
     * Default constructor.
     *
     * @param configuration with which the simulator will run.
     */
    public Simulator(Configuration configuration) {
        this.config = configuration;
        this.stats = new StatsCollector();
    } 

    
    /**
     * Runs a simulation.
     */
    public void run() {
    	
    		//shuffle bags in the queue TODO use distribution to set up the shuffling 
    		Collections.shuffle(config.getDefinition().getLuggageCarousel().getBagsQ());
    		
    		//config.getDefinition().setBehaviour(new ClusteringBehaviour(config, stats));
    		config.getDefinition().setBehaviour(new RegularBehaviour(config, stats));
    		
    		config.getDefinition().getBehaviour().step();
    		
    		for (DPassenger passenger: config.getDefinition().getPassengers()) {
    			stats.collect(passenger);
    		}

    		stats.writeCSV();
    	}
    
}
