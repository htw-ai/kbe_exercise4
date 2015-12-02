package de.htw_berlin.ai_bachelor.kbe.counter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by cschulze on 02.12.2015.
 *
 * 4.3
 * b) Warum handelt es sich bei JUnit um ein Framework?
 *
 * - JUnit bietet Methoden und Annotations, die einen Rahmen für die einfache Ausführung von Unittests schaffen
 * - JUnit verlangt für seine Verwendung eine ganz bestimmte Form - Convention over Configuration
 *
 * c)
 *
 * - Unittests werden in dedizierten Testklassen definiert. Diese Testklassen sind Äquvilanzklassen der Klassen
 *  unserer Businesslogik - pro Klasse unseres Programms schreiben wir also eine Testklasse. Jeder Unittest testet
 *  dabei in der Regel eine Methode seiner zu testenden Klasse. Wobei oft mehrere Unittest-Methoden dieselbe
 *  Business-Methode testen.
 *
 *
 */
public class CounterFactoryTest {


    @Test
    public void testGetCounterInstanceSimpleCounter() throws Exception {

        CounterFactory.getCounterInstance("simple").increment();
        int counter = CounterFactory.getCounterInstance("simple").getCounter();

        assertEquals(counter, 1);
    }

    @Test
    public void testGetCounterInstanceDoubleCounter() throws Exception {

        CounterFactory.getCounterInstance("double").increment();
        int counter = CounterFactory.getCounterInstance("double").getCounter();

        assertEquals(counter, 2);
    }

    @Test
    public void testGetCounterInstanceTripleCounter() throws Exception {

        CounterFactory.getCounterInstance("triple").increment();
        int counter = CounterFactory.getCounterInstance("triple").getCounter();

        assertEquals(counter, 3);
    }

    @Test
    public void testGetCounterInstanceFailure() throws Exception {
        try {
            CounterFactory.getCounterInstance("").increment();
            int counter = CounterFactory.getCounterInstance("").getCounter();

            fail("CounterFactory should throw an Exception when no Counter was specified!");
        } catch(Exception e){
            assertEquals("Counter type '' does not exist!", e.getMessage());
        }
    }

}