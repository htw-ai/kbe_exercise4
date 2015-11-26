package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterDouble implements ICounter {
	
	private int _counter;
	
	private static CounterDouble INSTANCE;
	
	private CounterDouble(){
		_counter = 1;
	}

	public static ICounter getInstance() {
		if (INSTANCE == null)
			INSTANCE = new CounterDouble();
			
		return INSTANCE;
	}

	public void increment() {
		_counter *= 2;
	}

	public int getCounter() {
		return _counter;
	}
}
