package Imam.edu.sa.simulator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Imam.edu.sa.behaviour.Behaviour;


public class Configuration {
	
	private DProblem definition;
	
    /**
     * Problem's file name.
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     */
	
	
    private Properties properties; // setting file from GenCli 

	
	//public String bagQ; I have to distribute bags randomly in the queue maybe this is done in the generator class
	//public int []itemsPerbag; may be this is done in the generator file give each passenger size of bag
	

        
        
    public Configuration(Properties properties, String generatedFileName) throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
       
    		// read from generated file 
    		ObjectMapper mapper = new ObjectMapper();
        setDefinition(mapper.readValue(new FileInputStream(generatedFileName), DProblem.class));
        // System.out.println(definition );

        // read from setting file of the simulator
        this.properties = properties;
        definition.setInterArrivalTime(Integer.valueOf(fetch("interArrivalTime")));
        definition.setTimeToPassLevel(Integer.valueOf(fetch("timeToPassLevel")));


    }
    
    private String fetch(String key) {
        if (properties.containsKey(key)) {
            String value = properties.getProperty(key).toLowerCase();
            return value;
        }
        System.err.println("Missing setting \"" + key + "\".");
        System.exit(1);
        return null;
    }

	public DProblem getDefinition() {
		return definition;
	}

	public void setDefinition(DProblem definition) {
		this.definition = definition;
	}




}
