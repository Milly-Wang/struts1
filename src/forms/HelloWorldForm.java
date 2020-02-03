//package forms;
//
//import org.apache.struts.action.ActionForm;
//
//public class HelloWorldForm extends ActionForm{
//	private String message;
//	public String getMessage(String message) {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
//}

package forms;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {


	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
