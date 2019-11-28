package com.nicordesigns.insurance.action;

import com.nicordesigns.insurance.model.Agent;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 4821216272008282533L;
	
	private Agent agentBean;

	@Override
	public String execute() throws Exception {
		
		// Call back end Service to store agentBean info in database..
		
		return SUCCESS;
	}

	public Agent getAgentBean() {
		return agentBean;
	}

	public void setAgentBean(Agent agentBean) {
		this.agentBean = agentBean;
	}

	
}
