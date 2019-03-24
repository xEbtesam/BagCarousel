
package Imam.edu.sa.simulator;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;


public class SimCLI {
	
	private  String generatedFileName;  // = "/resources/settings.properties"
	private  String propertiesFileName;  // = "/resources/settings.properties"
	private  Properties properties; // create a properties file 

    public SimCLI(String generatedFileName){
    		this.generatedFileName = generatedFileName;
    		
    		this.propertiesFileName = "/Users/ebtesam/eclipse-workspace/BagClustering/src/main/resources/sim.properties";
    		this.properties = new Properties();
    }
 
 
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		SimCLI cli = new SimCLI("/Users/ebtesam/eclipse-workspace/BagClustering/src/main/java/Imam/edu/sa/simulator/gen80.json");
	
		InputStream input = new FileInputStream(cli.propertiesFileName);
		
		try {
			cli.properties.load(input);
			} catch (IOException e) {
			e.printStackTrace();
		}
		
		Configuration config = new Configuration(cli.properties, cli.generatedFileName);		
		Simulator sim = new Simulator(config);
		
		try {
			FileWriter writer = new FileWriter("resultsCSV.csv", true);
			FileReader reader = new FileReader("resultsCSV.csv");
	
			String header = "Carousel Strategy,Carousel levels,# passengers,total Number of bags,"
					+ "Min time to finish,Mean Time to finish,Max time to finish\n";
			if (reader.read() == -1) {
				writer.append(header);
				writer.append("\n");
			}
			reader.close();

			writer.append("Carousel");
			writer.append(",");
			writer.append("" + config.getDefinition().getcLevel());
			writer.append(",");
			writer.append("" + config.getDefinition().getPassengerNo());
			writer.write(",");
			writer.close();
		} catch (IOException e) {}
		
		
		sim.run();		
	}


}
