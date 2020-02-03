//package actions;
//
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import forms.HelloWorldForm;
//
//import org.apache.struts.action.Action;
//import org.apache.struts.action.ActionForm;
//import org.apache.struts.action.ActionForward;
//import org.apache.struts.action.ActionMapping;
//
//public class HelloWorldAction extends Action{
//	@Override
//	public ActionForward execute(ActionMapping mapping, ActionForm form, 
//			HttpServletRequest request, HttpServletResponse response)throws Exception {
//		
//		HelloWorldForm hwf = (HelloWorldForm) form;
//		hwf.setMessage("Welcome Struts1.x of Marlabs");
//		return mapping.findForward("success");
//	}
//}
package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import forms.HelloWorldForm;

public class HelloWorldAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		HelloWorldForm hwf = (HelloWorldForm) form;
		hwf.setMessage("Hello Welcome to Marlabs");
		return mapping.findForward("success");
	}
}
