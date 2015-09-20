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
		// Initializing response message
		this.responseMessage = new CPIResponseMessage();
		
		// Initializing Cake SDK
		CakeSDK _sdk = new CakeSDK(this.config);
		
		// Delegating CPI method invocation to Cake SDK
		switch (this.requestMessage.getMethod()) {
		case "create_stemcell":
			
			break;

		case "delete_stemcell":
			
			break;
			
		case "create_vm":
			
			_sdk.runInstances();
			break;
			
		case "delete_vm":
			
			break;
			
		case "has_vm":
			
			break;
			
		case "reboot_vm":
		
			break;
			
		case "set_vm_metadata":
			
			break;
		
		case "configure_networks":
		
			break;
			
		case "delete_disk":
			
			break;
			
		case "has_disk":
			
			break;
			
		case "attach_disk":
			
			break;
			
		case "detach_disk":
			
			break;
			
		case "get_disks":
			
			break;
			
		case "snapshot_disk":
			
			break;
			
		case "delete_snapshot":
			
			break;
			
		case "current_vm_id":
			
			break;
		
		default:
			break;
		}
	}

}
