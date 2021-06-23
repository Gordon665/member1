package Demo.idv.gordon.triangle;

import static org.junit.Assert.*;

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
    public void testSomthing()
    {
    	App A = new App();
        assertEquals("Not a Triangle \n",A.testTriangle(-1,-1,-1));
        assertEquals("Regular Triangle \n",A.testTriangle(1,1,1));
        assertEquals("Right Triangle",A.testTriangle(5,12,13));
        assertEquals("Isoscceles Triangle \n",A.testTriangle(10,13,13));
        assertEquals("Not a Triangle \n",A.testTriangle(3,5,10)); 
    }
}
