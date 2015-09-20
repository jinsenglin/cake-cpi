package tw.jim.model;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CPIRequestMessageTest extends TestCase {

	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CPIRequestMessageTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CPIRequestMessageTest.class );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

}
