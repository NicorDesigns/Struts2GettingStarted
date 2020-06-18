package com.nicordesigns.insurance.admin.model;

public class State {
    
	private Integer stateId;
    private String stateName;
    private String stateTaxRate;
    private String stateCode;
    
    public State(Integer stateId, String countryName) {
        setStateId(stateId);
        setStateName(countryName);
    }

    public State() {
	
    }

	public void setStateId(Integer stateId) {
        if (stateId == null)
            throw new IllegalArgumentException("State ID must be non-null.");
        
        this.stateId = stateId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public String getStateTaxRate() {
		return stateTaxRate;
	}

	public void setStateTaxRate(String stateTaxRate) {
		this.stateTaxRate = stateTaxRate;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", stateTaxRate=" + stateTaxRate
				+ ", stateCode=" + stateCode + "]";
	}

	@Override
    public boolean equals(Object o) {
        return (o!=null) 
                && (o instanceof State) 
                && (((State) o).getStateId() != null) 
                && (stateId.equals(((State) o).getStateId()));
    }
}
