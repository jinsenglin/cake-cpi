package tw.jim.control;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CakeSDKTest extends TestCase {

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
	public CakeSDKTest(String name) {
		super(name);
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CakeSDKTest.class );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}
