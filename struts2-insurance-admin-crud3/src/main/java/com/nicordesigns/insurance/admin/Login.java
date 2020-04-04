package com.nicordesigns.insurance.admin;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

	private static final long serialVersionUID = -859202664641706715L;
	
	private String username;
	private String password;
	
	public String execute() throws Exception {

        if (isInvalid(getUsername())) return INPUT;

        if (isInvalid(getPassword())) return INPUT;

        return SUCCESS;
    }

    private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
