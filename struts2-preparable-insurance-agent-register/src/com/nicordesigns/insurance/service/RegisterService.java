package com.nicordesigns.insurance.service;

import java.util.List;

import com.nicordesigns.insurance.model.Agent;
import com.nicordesigns.insurance.model.State;

public interface RegisterService {
	
	Agent getAgent();
	
	void saveAgent(Agent agentBean);
	
	List<State> getAllStates();

	State getState(Long stateId);

	
		

}
