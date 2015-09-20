package tw.jim.model;

import org.json.JSONArray;
import org.json.JSONObject;

public class CPIRequestMessage {

	JSONObject message;
	
	public CPIRequestMessage(String message) {
		this.message = new JSONObject(message);
	}
	
	/**
	 * 
	 * @return Name of the CPI method. Example: create_vm.
	 */
	public String getMethod() {
		
		return this.message.getString("method");
	}
	
	/**
	 * 
	 * @return Array of arguments that are specific to the CPI method.
	 */
	public JSONArray getArguments() {
		return this.message.getJSONArray("arguments");
	}
	
	/**
	 * 
	 * @return Additional information provided as a context of this execution. Specified for backwards compatibility and should be ignored.
	 */
	public JSONObject getContent() {
		return this.message.getJSONObject("context");
	}
	
	@Override
    public String toString() {
        return message.toString();
    }

}
