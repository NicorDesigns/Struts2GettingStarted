package com.nicordesigns.insurance.admin.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nicordesigns.insurance.admin.model.Agent;
import com.nicordesigns.insurance.admin.model.State;
import com.nicordesigns.insurance.admin.service.AgentServiceInterface;
import com.nicordesigns.insurance.admin.springconfig.SpringJDBCConfig;

public class SpringMain {
	
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				SpringJDBCConfig.class);
 
		//Get the TrxalisDAO Bean
		AgentServiceInterface agentService = ctx.getBean("agentService", AgentServiceInterface.class);
		
		// Get all States
		List<State> stateList = agentService.getAllStates();
		for (State state : stateList) {
			System.out.println("State Id " + state.getStateId() + ":" + state.toString());
			State currentState = agentService.getState(state.getStateId());
			System.out.println("Current State (single sql select) "+ currentState.toString());
		}
		
		Agent zombieAgent = new Agent("Nick", "Zombie", "C", "713 Fear Drive", 
	    		  "Walking Deadville", "Atlanta", stateList.get(0).getStateId(), stateList.get(0), "30368", "nick.zombie@nicordesigns.tech", "NicorDesigns LLC", 
	    		  false, false);
		
		System.out.println(zombieAgent);
				

		
		List<Agent> agentList = agentService.getAllAgents();
		
		for (Agent agent: agentList) {
			System.out.println("Agent Object: " + agent.toString());
		}
		
		
		Agent agent = agentService.getAgent(3);
		System.out.println("Get Agent Agent Id " + agent.getId() + ":" + agent.toString());
		
		
		ctx.close();
		
		System.out.println("DONE");
	}

}
