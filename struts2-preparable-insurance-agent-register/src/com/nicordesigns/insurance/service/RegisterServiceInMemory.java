package com.nicordesigns.insurance.service;

import java.util.Arrays;
import java.util.List;

import com.nicordesigns.insurance.model.Agent;
import com.nicordesigns.insurance.model.State;

public class RegisterServiceInMemory implements RegisterService {

	private static Agent agent;
	private static final State[] states;
	
	
	static {
		
		states = new State[] {new State((long) 1, "Florida", "FL"),
                new State((long) 2, "Georgia", "GA"),
                new State((long) 3, "Alabama", "AL"),
                new State((long) 4, "South Carolina", "SC")};
		
		
		agent = new Agent();
		agent.setFirstName("Agent First Name");
		agent.setLastName("Agent Last Name");
		agent.setEmail("Agent Email");
		agent.setStateId((long) 1);
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
		RegisterServiceInMemory.agent.setStateId(agentBean.getStateId());

	}

	@Override
	public List<State> getAllStates() {
		return Arrays.asList(states);
	}

	@Override
	public State getState(Long stateId) {
		List<State> stateList = Arrays.asList(states);
		State theState = stateList.stream()
				  .filter(state -> stateId.equals(state.getStateId()))
				  .findAny()
				  .orElse(null);
		return theState;
	}

	
}
