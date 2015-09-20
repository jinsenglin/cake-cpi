package tw.jim;

import java.io.Console;
import tw.jim.control.CPIProcessor;
import tw.jim.model.CPIConfig;
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
	 * @param args The args[0] is a JSON file
	 */
    public static void main( String[] args )
    {
    	// loading CPI IaaS configuration file from argument
    	CPIConfig _config = new CPIConfig(args[0]);
    	
    	// reading CPI request message from stdin
    	Console _console = System.console();
    	String _line = _console.readLine();
    	CPIRequestMessage _request_message = new CPIRequestMessage(_line);
    	
    	// sending  CPI request and then getting CPI response
    	CPIProcessor _processor = new CPIProcessor(_config, _request_message);
    	CPIResponseMessage _response_message = _processor.getResponse();
    	
    	// responding CPI call result
        System.out.println( _response_message );
    }
}
