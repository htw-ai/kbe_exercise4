package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterTriple implements ICounter {
	
	private int _counter;
	
	private static CounterTriple INSTANCE;
	
	private CounterTriple(){
		_counter = 1;
	}

	public static ICounter getInstance() {
		if (INSTANCE == null)
			INSTANCE = new CounterTriple();
			
		return INSTANCE;
	}

	public void increment() {
		_counter *= 3;
	}

	public int getCounter() {
		return _counter;
	}
}