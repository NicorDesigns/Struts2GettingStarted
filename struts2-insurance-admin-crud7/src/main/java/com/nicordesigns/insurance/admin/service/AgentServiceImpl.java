package com.nicordesigns.insurance.admin.service;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.nicordesigns.insurance.admin.model.Agent;
import com.nicordesigns.insurance.admin.model.State;

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
			agent.setId((Integer) agentRow.get("AGENT_ID"));
			agent.setFirstName(String.valueOf(agentRow.get("AGENT_FIRST_NAME")));
			agent.setLastName(String.valueOf(agentRow.get("AGENT_LAST_NAME")));
			agent.setMidddleInitial(String.valueOf(agentRow.get("AGENT_MIDDLE_INITIAL")));
			agent.setAddressLine1(String.valueOf(agentRow.get("AGENT_ADDRESS_LINE1")));
			agent.setAddressLine2(String.valueOf(agentRow.get("AGENT_ADDRESS_LINE2")));
			agent.setCity(String.valueOf(agentRow.get("AGENT_CITY")));
			agent.setStateId((Integer) agentRow.get("AGENT_STATE_ID"));
			agent.setState(getState((Integer) agentRow.get("AGENT_STATE_ID")));
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

	@Override
	public List<State> getAllStates() {
		String query = "SELECT * FROM STATES";
		List<State> stateList = new ArrayList<State>();

		List<Map<String, Object>> stateRows = jdbcTemplate.queryForList(query);

		for (Map<String, Object> stateRow : stateRows) {
			State state = new State();
			state.setStateId((Integer) stateRow.get("STATE_ID"));
			state.setStateName(String.valueOf(stateRow.get("STATE_NAME")));
			state.setStateCode(String.valueOf(stateRow.get("STATE_CODE")));
			state.setStateTaxRate(String.valueOf(stateRow.get("STATE_TAXRATE")));
			logger.debug("Setting State values : " + state.toString());
			stateList.add(state);
		}
		return stateList;
	}

	@Override
	public Agent getAgent(Integer agentId) {
		logger.debug("Get Insurance Agent  Id = " + agentId);
		String query = "SELECT * FROM INSURANCE_AGENTS WHERE AGENT_ID = ?";

		Object[] params = new Object[] { agentId };

		int[] types = new int[] { Types.BIGINT };

		List<Agent> agentList = new ArrayList<Agent>();

		List<Map<String, Object>> agentRows = jdbcTemplate.queryForList(query, params, types);

		for (Map<String, Object> agentRow : agentRows) {

			Agent agent = new Agent();
			agent.setId(Integer.parseInt(String.valueOf(agentRow.get("AGENT_ID"))));
			agent.setFirstName(String.valueOf(agentRow.get("AGENT_FIRST_NAME")));
			agent.setLastName(String.valueOf(agentRow.get("AGENT_LAST_NAME")));
			agent.setMidddleInitial(String.valueOf(agentRow.get("AGENT_MIDDLE_INITIAL")));
			agent.setAddressLine1(String.valueOf(agentRow.get("AGENT_ADDRESS_LINE1")));
			agent.setAddressLine2(String.valueOf(agentRow.get("AGENT_ADDRESS_LINE2")));
			agent.setCity(String.valueOf(agentRow.get("AGENT_CITY")));
			agent.setStateId((Integer) agentRow.get("AGENT_STATE_ID"));
			agent.setState(getState((Integer) agentRow.get("AGENT_STATE_ID")));
			agent.setPostalCodeZip(String.valueOf(agentRow.get("AGENT_POSTALCODE")));
			agent.setEmail(String.valueOf(agentRow.get("AGENT_EMAIL")));
			logger.debug("AGENT_ACTIVE_YESNO String value : " + (String) agentRow.get("AGENT_ACTIVE_YESNO"));
			logger.debug("AGENT_ACTIVE_YESNO \"Y\".equalsIgnoreCase Boolean value : "
					+ "Y".equalsIgnoreCase((String) agentRow.get("AGENT_ACTIVE_YESNO")));
			agent.setActive("Y".equalsIgnoreCase((String) agentRow.get("AGENT_ACTIVE_YESNO")));
			logger.debug("Agent Object isActive Boolean value : " + agent.isActive());
			agent.setExpensed("Y".equalsIgnoreCase((String) agentRow.get("AGENT_EXPENSE_ENABLED_YESNO")));
			agent.setCompany(String.valueOf(agentRow.get("COMPANY")));
			logger.debug("Setting Insurance Agent values : " + agent.toString());
			agentList.add(agent);
		}

		return agentList.get(0);


	}

	@Override
	public State getState(Integer stateId) {
		logger.debug("Getting State for State Id  : " + stateId);

		// define query arguments
		Object[] params = new Object[] { stateId };

		// define SQL types of the arguments
		int[] types = new int[] { Types.DECIMAL, };

		String query = "SELECT * FROM STATES WHERE STATE_ID = ?";

		List<State> stateList = new ArrayList<State>();

		List<Map<String, Object>> stateRows = jdbcTemplate.queryForList(query, params, types);

		for (Map<String, Object> stateRow : stateRows) {
			State state = new State();
			state.setStateId((Integer) stateRow.get("STATE_ID"));
			state.setStateName(String.valueOf(stateRow.get("STATE_NAME")));
			state.setStateCode(String.valueOf(stateRow.get("STATE_CODE")));
			state.setStateTaxRate(String.valueOf(stateRow.get("STATE_TAXRATE")));
			logger.debug("Setting State values : " + state.toString());
			stateList.add(state);
		}

		return stateList.get(0);
	}

}
