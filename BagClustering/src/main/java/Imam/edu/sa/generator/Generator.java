package Imam.edu.sa.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.codehaus.jackson.map.ObjectMapper;

import Imam.edu.sa.simulator.DPassenger;
import Imam.edu.sa.simulator.DProblem;
import Imam.edu.sa.simulator.LuggageCarousel;





/**
 * 
 * @author Ebtesam
 * generate scenario based on the settings values
 * 
 */



public class Generator {
	
    private final Configuration config;
    private final Random r;
	
	public Generator(Configuration config) {
        this.config = config;
        this.r = new Random();	
        }
	
    public void run() {
        DProblem p = createProblemDefinition();
        writeScenario(p);
    }

    private void writeScenario(DProblem p) {
        // Open output file
        ObjectMapper json = new ObjectMapper();
       try {
    	   		json.writeValue(config.getOutput(), p);
            //System.out.println(p.getPassengerNo()+" "+p.getcLevel()+ " "+ p.getMaxBag()+" "+ p.getLuggageCarousel().getBagsQ().size());
        } catch (IOException ex) {
       }
    }
    private DProblem createProblemDefinition() {
    		DProblem p = new DProblem();
    		
    		p.setcLevel(config.getBcLevel());
    		p.setMaxBag(config.getMaxBag());
    		p.setPassengerNo(config.getPassengerNo());
    		p.setLuggageCarousel(new LuggageCarousel(config.getBcLevel()));
    		addPassenger(p);
        return p;
    }
    
    
    private void addPassenger(DProblem p) {
        ArrayList<DPassenger> passenger = p.getPassengers();
        for (int i=0; i<config.getPassengerNo(); i++) {
        		DPassenger ps = new DPassenger(p.getcLevel(), r.nextInt(config.getMaxBag())+1);
        		p.getLuggageCarousel().addBags(ps.getPassengerName(), ps.getLuggageNo());
            passenger.add(ps);
        }
    }

}
