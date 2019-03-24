package Imam.edu.sa.simulator;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;



public class StatsCollector {
	
	private DescriptiveStatistics passStats = new DescriptiveStatistics();
	private DescriptiveStatistics bagStats = new DescriptiveStatistics();


	
	public void collect(DPassenger p) {
		passStats.addValue(p.getDispenseTime());
	}
	
	public void collect(Bag b) {
		bagStats.addValue(b.getBagArrivalTime());
	}
	
	/** Print results to a result file
	 * titled "resultsCSV.txt"
	 */
	

	public void writeCSV() {
		StringBuilder buf = new StringBuilder();

		buf.append((int) bagStats.getN()).append(",")
		   .append((int) passStats.getMin()).append(",")
		   .append((int) passStats.getMean()).append(",")
		   .append((int) passStats.getMax()).append(",");


		try {
			FileWriter writer = new FileWriter("resultsCSV.csv", true);
			String[] results = buf.toString().split("\n");
			for (String s : results) {
				writer.append(s);
			}
			writer.append("\n");
			writer.append("\n");

			writer.close();
		} catch (IOException e) {
		}
	}

	
	
}
