package com.nicordesigns.insurance.admin;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nicordesigns.insurance.admin.model.Agent;
import com.nicordesigns.insurance.admin.service.AgentServiceInterface;
import com.nicordesigns.insurance.admin.utils.Administrator;
import com.nicordesigns.insurance.admin.utils.AdministratorAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class AgentAction extends ActionSupport implements Preparable, AdministratorAware    {

	
private static final long serialVersionUID = 9179369667743801381L;
	
	private static final Logger LOG = LogManager.getLogger(AgentAction.class.getName());
    
	private AgentServiceInterface agentService;
    
	private Administrator currentAdministrator;
    
    public AgentServiceInterface getAgentService() {
		return agentService;
	}

	public void setAgentService(AgentServiceInterface agentService) {
		this.agentService = agentService;
	}

	private Agent agent;
    private List<Agent> agents;

	@Override
	public void prepare() throws Exception {
		
	}
	
	 /**
     * Get all agents for display in the view.
     */
    public String list() {
        agents = agentService.getAllAgents();
        LOG.info("Listing agents");
        return SUCCESS;
    }

	@Override
	public void setAdministrator(Administrator administrator) {
		LOG.info("Adminstrator populated by authentication interceptor" + administrator.toString());
		this.setCurrentAdministrator(administrator);
	}

	public Administrator getCurrentAdministrator() {
		return currentAdministrator;
	}

	public void setCurrentAdministrator(Administrator currentAdministrator) {
		this.currentAdministrator = currentAdministrator;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public List<Agent> getAgents() {
		return agents;
	}

	public void setAgents(List<Agent> agents) {
		this.agents = agents;
	}

}
