package Imam.edu.sa.generator;

import java.io.*;
import java.util.Properties;




/**
 * 
 * @author Ebtesam
 *
 */
public class GenCli {
	
	private  String propertiesFileName;  // = "/resources/settings.properties"
	private  Properties properties; // create a properties file 

	
	public GenCli(String propertiesFileName) {
	  this.propertiesFileName = propertiesFileName;
	  this.properties = new Properties();
	} 
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// TODO read file name from command line
		GenCli cli = new GenCli("/Users/ebtesam/eclipse-workspace/BagClustering/src/main/resources/test.properties"); 
		
		InputStream input = new FileInputStream(cli.propertiesFileName);
		
		try {
			cli.properties.load(input);
			} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println("number-of-passengers "+cli.properties.getProperty("number-of-passengers"));
		
		Configuration config = new Configuration(cli.properties, cli.propertiesFileName);
		Generator gen = new Generator(config);
		gen.run();
	    
	    // fetch information from generator properties file 
	    

 }
  
}
