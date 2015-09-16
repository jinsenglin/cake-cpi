package tw.jim;

import tw.jim.schema.CPIResponseMessage;

/**
 * BOSH CPI SPEC:
 * - http://bosh.io/docs/build-cpi.html
 * - http://bosh.io/docs/cpi-api-v1.html
 *
 */
public class App 
{
	/**
	 * Callee sends a single JSON request over STDIN
	 * CPI responds with a single JSON response over STDOUT
	 * 
	 * @param args The args[0] is a JSON string
	 */
    public static void main( String[] args )
    {
        System.out.println( new CPIResponseMessage() );
    }
}
