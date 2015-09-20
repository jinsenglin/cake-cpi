package tw.jim.control;

import tw.jim.model.CPIRequestMessage;
import tw.jim.model.CPIResponseMessage;

public class CPIProcessor {

	CPIRequestMessage requestMessage;
	CPIResponseMessage responseMessage;
	
	public CPIProcessor(CPIRequestMessage message) {
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
