package com.nicordesigns.insurance.admin.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nicordesigns.insurance.admin.model.Agent;

@Component
public class AgentServiceImpl implements AgentServiceInterface {

	private static final Logger logger = LogManager.getLogger(AgentServiceImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Agent> getAllAgents() {
		String query = "SELECT * FROM INSURANCE_AGENTS";
		List<Agent> agentList = new ArrayList<Agent>();

		List<Map<String, Object>> agentRows = jdbcTemplate.queryForList(query);

		for (Map<String, Object> agentRow : agentRows) {
			Agent agent = new Agent();
			agent.setId(Integer.parseInt((String)agentRow.get("AGENT_ID")));
			agent.setFirstName(String.valueOf(agentRow.get("AGENT_FIRST_NAME")));
			agent.setLastName(String.valueOf(agentRow.get("AGENT_LAST_NAME")));
			agent.setMidddleInitial(String.valueOf(agentRow.get("AGENT_MIDDLE_INITIAL")));
			agent.setAddressLine1(String.valueOf(agentRow.get("AGENT_ADDRESS_LINE1")));
			agent.setAddressLine2(String.valueOf(agentRow.get("AGENT_ADDRESS_LINE2")));
			agent.setCity(String.valueOf(agentRow.get("AGENT_CITY")));
			agent.setStateId((BigDecimal) agentRow.get("AGENT_STATE_ID"));
			agent.setPostalCodeZip(String.valueOf(agentRow.get("AGENT_POSTALCODE")));
			agent.setEmail(String.valueOf(agentRow.get("AGENT_EMAIL")));
			agent.setActive(Boolean.getBoolean((String) agentRow.get("AGENT_ACTIVE_YESNO")));
			agent.setExpensed(Boolean.getBoolean((String) agentRow.get("AGENT_EXPENSE_ENABLED_YESNO")));
			agent.setCompany(String.valueOf(agentRow.get("COMPANY")));
			logger.debug("Setting Insurance Agent values : " + agent.toString());
			agentList.add(agent);
		}
		return agentList;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}

}
