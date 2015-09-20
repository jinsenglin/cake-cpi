package tw.jim.model;

import org.json.JSONObject;

public class CPIResponseMessage {
	
	JSONObject message;
	
	public CPIResponseMessage() {
		this.message = new JSONObject();
		this.message.put("result", "");
		this.message.put("error", org.json.JSONObject.NULL);
		this.message.put("log", "");
	}
	
	/**
	 * 
	 * @param result Single return value.
	 * @param log Additional information that may be useful for auditing, debugging and understanding what actions CPI took while executing a method. Typically includes info and debug logs, error backtraces.
	 */
	public void setResult(String result, String log) {
		this.message = new JSONObject();
		this.message.put("result", result);
		this.message.put("error", org.json.JSONObject.NULL);
		this.message.put("log", log);
	}
	
	/**
	 * 
	 * @param type Type of the error.
	 * @param message Description of the error.
	 * @param ok_to_retry Indicates whether callee should try calling the method again without changing any of the arguments.
	 * @param log Additional information that may be useful for auditing, debugging and understanding what actions CPI took while executing a method. Typically includes info and debug logs, error backtraces.
	 */
	public void setError(String type, String message, boolean ok_to_retry, String log) {
		this.message.put("result", org.json.JSONObject.NULL);
		
		JSONObject _error = new JSONObject();
		_error.put("type", type);
		_error.put("message", message);
		_error.put("ok_to_retry", ok_to_retry);
		this.message.put("error", _error);
		
		this.message.put("log", log);
	}

	@Override
    public String toString() {
        return message.toString();
    }
	
}
