package com.nicordesigns.insurance.service;

import com.nicordesigns.insurance.model.Agent;

public class RegisterServiceInMemory implements RegisterService {

	private static Agent agent;
	
	static {
		agent = new Agent();
		agent.setFirstName("Agent First Name");
		agent.setLastName("Agent Last Name");
		agent.setEmail("Agent Email");
	}
	@Override
	public Agent getAgent() {
		
		return RegisterServiceInMemory.agent;
	}

	@Override
	public void saveAgent(Agent agentBean) {
		RegisterServiceInMemory.agent.setFirstName(agentBean.getFirstName());
		RegisterServiceInMemory.agent.setLastName(agentBean.getLastName());
		RegisterServiceInMemory.agent.setEmail(agentBean.getEmail());

	}

}
