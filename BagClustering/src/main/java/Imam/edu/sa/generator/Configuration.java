package Imam.edu.sa.generator;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

/**
 * 
 * @author Ebtesam
 * read the scenario settings values
 *
 */
public class Configuration {
	
    private Properties properties; // setting file from GenCli 
    private HashMap<String, String> generatorSettings = new HashMap<String, String>(); // HashMap the scenario 

 
	private short passengerNo;
	private short bcLevel;
	private short maxBag;
	private OutputStream out ;
	
	//public String bagQ; I have to distribute bags randomly in the queue maybe this is done in the generator class
	//public int []itemsPerbag; may be this is done in the generator file give each passenger size of bag
	
    Configuration(Properties properties, String genFileName) {
        this.properties = properties;
        this.passengerNo = Short.valueOf(fetch("number-of-passengers"));
        this.bcLevel = Short.valueOf(fetch("clevel"));
        this.maxBag = Short.valueOf(fetch("max-bag"));

        try {
        	setOutput(new FileOutputStream(genFileName+".gen"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
    }
    
    private String fetch(String key) {
        if (properties.containsKey(key)) {
            String value = properties.getProperty(key).toLowerCase();
            generatorSettings.put(key, value); // Hash map has been built using the generator file. 
            return value;
        }
        System.err.println("Missing setting \"" + key + "\".");
        System.exit(1);
        return null;
    }

	
	public short getPassengerNo() {
		return passengerNo;
	}
	public void setPassengerNo(short passengerNo) {
		this.passengerNo = passengerNo;
	}
	public short getBcLevel() {
		return bcLevel;
	}
	public void setBcLevel(short bcLevel) {
		this.bcLevel = bcLevel;
	}
	public short getMaxBag() {
		return maxBag;
	}
	public void setMaxBag(short maxBag) {
		this.maxBag = maxBag;
	}
    public HashMap<String, String> getGeneratorSettings() {
        return generatorSettings;
    }

	public OutputStream getOutput() {
		return out;
	}

	public void setOutput(OutputStream out) {
		this.out = out;
	}


}
