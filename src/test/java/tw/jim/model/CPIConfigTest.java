package tw.jim.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CPIConfigTest extends TestCase {

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
	public CPIConfigTest(String name) {
		super(name);
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CPIConfigTest.class );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}
