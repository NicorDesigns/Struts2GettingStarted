package com.nicordesigns.insurance.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.nicordesigns.insurance.exception.SecurityBreachException;
import com.nicordesigns.insurance.model.Agent;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport implements SessionAware {


	private static final long serialVersionUID = 4821216272008282533L;
	
	private Agent agentBean;
	
	private Map<String, Object> session ;
	
	private static final String REGISTERED_AGENT = "registeredAgent";

	@Override
	public String execute() throws Exception {
		
		// Call back end Service to store agentBean info in database..
		//throw new Exception("Exception in Register Action");
		
		session.put(REGISTERED_AGENT, agentBean);
		
		return SUCCESS;
	}
	
	public void throwSecurityException() throws SecurityBreachException {

		throw new SecurityBreachException(
				"Security breach exception thrown from throwSecurityException");
	}
	
	public void setSession(Map<String, Object> session) {
		
		this.session = session ;

	}

	
	@Override
	public void validate() {
		
		if (agentBean.getFirstName().length() == 0) {
			addFieldError("agentBean.firstName", "First Name is required");
		}
		
		if (agentBean.getLastName().length() == 0) {
			addFieldError("agentBean.lastName", "Last name is required.");
		}

		if (agentBean.getEmail().length() == 0) {
			addFieldError("agentBean.email", "Email is required.");
		}
	}
	
	
	public Agent getAgentBean() {
		return agentBean;
	}

	public void setAgentBean(Agent agentBean) {
		this.agentBean = agentBean;
	}

	
}
