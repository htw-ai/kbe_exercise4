package kbe_ue4_2e;

import de.htw_berlin.ai_bachelor.kbe.counter.CounterFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		CounterFactory.getCounterInstance("simple").increment();
		int counter = CounterFactory.getCounterInstance("simple").getCounter();
		
		System.out.println(counter);
		
	}

}
