package de.htw_berlin.ai_bachelor.kbe.counter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
    	
        CounterFactory.getCounterInstance("simple").increment();
        int counter = CounterFactory.getCounterInstance("simple").getCounter();
        System.out.println("SimpleCounter: " + counter);

        CounterFactory.getCounterInstance("double").increment();
        counter = CounterFactory.getCounterInstance("double").getCounter();
        System.out.println("DoubleCounter: " + counter);

        CounterFactory.getCounterInstance("triple").increment();
        counter = CounterFactory.getCounterInstance("triple").getCounter();
        System.out.println("TripleCounter: " + counter);

    }
}
