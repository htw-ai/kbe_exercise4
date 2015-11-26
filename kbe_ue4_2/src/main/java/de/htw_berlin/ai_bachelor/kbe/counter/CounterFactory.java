package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Hello world!
 *
 */
public class CounterFactory{
	
	public static ICounter getCounterInstance(String counterName) throws Exception{
		switch (counterName) {
		case "simple":
			return CounterSimple.getInstance();
		case "double":
			return CounterDouble.getInstance();
		case "triple":
			return CounterTriple.getInstance();
		default:
			throw new Exception("Counter type '" + counterName + "' does not exist!");
		}
	}
	
}