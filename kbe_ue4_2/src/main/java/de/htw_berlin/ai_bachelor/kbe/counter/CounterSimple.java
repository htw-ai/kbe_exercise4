package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterSimple implements ICounter {
	
	private int _counter;
	
	private static CounterSimple INSTANCE;
	
	private CounterSimple(){
		_counter = 0;
	}

	public static ICounter getInstance() {
		if (INSTANCE == null)
			INSTANCE = new CounterSimple();
			
		return INSTANCE;
	}

	public void increment() {
		_counter++;
	}

	public int getCounter() {
		return _counter;
	}
	
}
