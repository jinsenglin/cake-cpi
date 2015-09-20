package tw.jim.control;

import tw.jim.model.CPIConfig;
import tw.jim.model.CPIRequestMessage;
import tw.jim.model.CPIResponseMessage;

public class CPIProcessor {

	CPIConfig config;
	CPIRequestMessage requestMessage;
	CPIResponseMessage responseMessage;
	
	public CPIProcessor(CPIConfig config, CPIRequestMessage message) {
		this.config = config;
		this.requestMessage = message;
	}
	public CPIResponseMessage getResponse() {
		this.process();
		return this.responseMessage;
	}
	private void process() {
		this.responseMessage = new CPIResponseMessage();
	}

}
