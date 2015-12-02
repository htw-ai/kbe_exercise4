package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Hello world!
 *
 */
public class CounterFactory{
	
	public static ICounter getCounterInstance(String counterName) throws Exception{
		switch (counterName) {
		case "simple":
			//CounterSimple.getInstance().increment();
			return CounterSimple.getInstance();
		case "double":
			//CounterDouble.getInstance().increment();
			return CounterDouble.getInstance();
		case "triple":
			//CounterTriple.getInstance().increment();
			return CounterTriple.getInstance();
		default:
			throw new Exception("Counter type '" + counterName + "' does not exist!");
		}
	}
	
}