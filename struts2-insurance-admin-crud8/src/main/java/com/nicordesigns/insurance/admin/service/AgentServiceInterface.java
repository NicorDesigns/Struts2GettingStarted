package com.nicordesigns.insurance.admin.service;

import java.util.List;
import com.nicordesigns.insurance.admin.model.Agent;
import com.nicordesigns.insurance.admin.model.State;

public interface AgentServiceInterface {
	
	List<Agent> getAllAgents();
	
	List<State> getAllStates();

	Agent getAgent(Integer agentId);
	
	State getState(Integer stateId);
	
	public void updateAgent(Agent agent);

}
