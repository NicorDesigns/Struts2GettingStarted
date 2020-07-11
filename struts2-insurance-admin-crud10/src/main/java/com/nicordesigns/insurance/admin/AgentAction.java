package com.nicordesigns.insurance.admin;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nicordesigns.insurance.admin.model.Agent;
import com.nicordesigns.insurance.admin.model.State;
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

	private String agentId;
	private Agent agent;
    private List<Agent> agents;
    private List<State> states;

	@Override
	public void prepare() throws Exception {
		setStates(agentService.getAllStates());
        LOG.info("Prepared support data for Agent entity.");        
        if (agent != null) { 
        	LOG.info("agent=" + agent);
        	if (agent.getId()!=null) {
            	LOG.info("agent.getId()=" + agent.getId());        
            } else {
            	LOG.info("agent.getId()=null");
            }
        } else {
        	LOG.info("agent = null");
        }
        
        if (agent != null && agent.getId() != null) {
            agent = agentService.getAgent(agent.getId());
            LOG.info("Preparing actual data for Agent: " + agent);
        }
		
	}
	
	 /**
     * Get all agents for display in the view.
     */
    public String list() {
        agents = agentService.getAllAgents();
        LOG.info("Listing agents");
        return SUCCESS;
    }
    
    /***
     * Populate a single Insurance Agent to show in Edit/Update Form
     */
	public String show() {

		if (agentId != null) {
			LOG.info("Getting Agent Id Value : " + agentId);
			int i = Integer.parseInt(agentId);
			agent = agentService.getAgent(i); // Autoboxing int Integer happening here
			LOG.info("Populate an Agent Display form with :" + agent.toString());
		}
		return SUCCESS;
	}
    
    public String save() {
    	LOG.info("In Save Method for : " + agentId);
    	 
    	if (agent.getId() != null) {
    	
    		 LOG.info("Updating Agent: " + agent.toString());
    		    
    		 agentService.updateAgent(agent);
    		 
    		 LOG.info("Updated Agent: " + agent);
    	 
    	 } else {
 	
    		 LOG.info("Creating new Agent: " + agent);
    		 Integer insertAgent = agentService.insertAgent(agent);
 			 LOG.info("Created new Agent: " + insertAgent);
 		
    	 }
        return SUCCESS;
    }
    
    public String cancel() {
    	LOG.info("In Cancel Method for : " + agentId);
        return SUCCESS;
    }
    
    public String delete() {
        agentService.deleteAgent(agent.getId());
        LOG.info("Deleted Agent: " + agent);
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

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

}
