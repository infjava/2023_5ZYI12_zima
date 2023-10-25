

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KalkulackaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KalkulackaTest {
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        
    }

    @Test
    public void spocitaj5A9()
    {
        Kalkulacka kalkulac1 = new Kalkulacka();
        kalkulac1.zadajCislo(5);
        kalkulac1.pripocitaj(9);
        assertEquals(14, kalkulac1.getVysledok(), 0.1);
    }
}

