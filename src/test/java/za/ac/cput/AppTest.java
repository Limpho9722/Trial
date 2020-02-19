package za.ac.cput;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void add()
    {
        App calc = new App();
        int result = calc.add(6,4); // changed from subtract to add
        assertEquals(2,result);
    }
}
