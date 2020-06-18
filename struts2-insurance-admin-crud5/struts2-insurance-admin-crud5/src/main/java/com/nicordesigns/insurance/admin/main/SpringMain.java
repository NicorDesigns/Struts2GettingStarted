package com.nicordesigns.insurance.admin.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nicordesigns.insurance.admin.model.Agent;
import com.nicordesigns.insurance.admin.service.AgentServiceInterface;
import com.nicordesigns.insurance.admin.springconfig.SpringJDBCConfig;

public class SpringMain {
	
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				SpringJDBCConfig.class);
 
		//Get the TrxalisDAO Bean
		AgentServiceInterface agentService = ctx.getBean("agentService", AgentServiceInterface.class);
		List<Agent> agentList = agentService.getAllAgents();
		
		for (Agent agent: agentList) {
			System.out.println("Agent Object: " + agent.toString());
		}
		
		ctx.close();
		
		System.out.println("DONE");
	}

}
