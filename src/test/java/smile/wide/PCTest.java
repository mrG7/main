package smile.wide;

import org.apache.commons.lang3.time.DurationFormatUtils;

import smile.wide.algorithms.independence.MinimumCutSet;
import smile.wide.algorithms.pc.PC;
import smile.wide.data.SMILEData;
import smile.wide.utils.Pattern;

public class PCTest {
	public static void main(String args[])
	{
		SMILEData ds = new SMILEData();
		System.out.println("Loading test data");
		//ds.Read("input/Alarm5k.txt");
		//ds.Read("input/Hepar14k.txt");
		//ds.Read("input/Cpcs179.txt");
		//ds.Read("input/retention.txt");
		//ds.Read("input/Alarm10_s5000_v10.txt");
		ds.Read("input/HailFinder10_s5000_v10.txt");
		//ds.Read("input/HailFinder10_s500_v10.txt");
		Pattern pat = new Pattern();
		PC alg = new PC();
		alg.maxAdjacency = 8;
		alg.significance = 0.05;
		//Test the PC class with same dataset. print out result
		long time = System.currentTimeMillis();
		System.out.println("Test PC class");
		//do something that takes some time...
		pat = alg.Learn(ds);
		System.out.println();
		System.out.println("Result");
		//pat.Print();
		long completedIn = System.currentTimeMillis() - time;
		System.out.println(DurationFormatUtils.formatDuration(completedIn, "HH:mm:ss:SS"));
	}
}
