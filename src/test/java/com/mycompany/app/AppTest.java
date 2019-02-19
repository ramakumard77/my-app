package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * Added junit plugins to get test reports - Ram
*/
import junit.framework.Test;  
import junit.framework.TestCase;  
import junit.framework.TestSuite;  

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /** 
     * Create the test case  - Ram
     * @param testName name of the test case 
     */  
    public AppTest( String testName )  
    {  
        super( testName );  
    }  
   
    /** 
     * @return the suite of tests being tested -Ram
     */  
    public static Test suite()  
    {  
        return new TestSuite( AppTest.class );  
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    /**
     * Rigorous Test 2:-) Ram
     */
    @Test
    public void shouldKeyWithTrue()
    {
        assertTrue( true );
    }
}
