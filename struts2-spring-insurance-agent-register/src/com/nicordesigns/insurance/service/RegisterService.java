package com.nicordesigns.insurance.service;

import com.nicordesigns.insurance.model.Agent;

public interface RegisterService {
	
	Agent getAgent();
	
	void saveAgent(Agent agentBean);
	

}
