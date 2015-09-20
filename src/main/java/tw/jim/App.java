package tw.jim;

import tw.jim.control.CPIProcessor;
import tw.jim.model.CPIRequestMessage;
import tw.jim.model.CPIResponseMessage;

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
    	CPIRequestMessage _request_message = new CPIRequestMessage(args[0]);
    	CPIProcessor _processor = new CPIProcessor(_request_message);
    	CPIResponseMessage _response_message = _processor.getResponse();
        System.out.println( _response_message );
    }
}
