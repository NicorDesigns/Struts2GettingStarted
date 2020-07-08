package com.nicordesigns.insurance.admin;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.nicordesigns.insurance.admin.utils.Administrator;
import com.nicordesigns.insurance.admin.utils.AdministratorService;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = -859202664641706715L;
	private Map<String, Object> session;
	private static final Logger logger = LogManager.getLogger(Login.class);

	
	private String username;
	private String password;
	
	
	
	@Override
	public void validate() {
		if (this.getUsername()==null) {
			addFieldError("username", "Administrator Name is Required");
		} else if (this.getUsername().length() == 0) {
			addFieldError("username", "Administrator Name is Required");
		}
		
		if (this.getPassword()==null) {
			addFieldError("password", "Password is Required");
		} else if (this.getPassword().length() == 0) {
			addFieldError("password", "Password is Required");
		}
	}
	
	public String execute() throws Exception {

        Administrator administrator = ((AdministratorService) getAdministratorService()).authenticateAdministrator( getUsername(), getPassword() ); 
		
        if ( administrator == null )
		{
        	logger.debug("User not valid, return to input page.");
			return INPUT;
		}
		else{
			//Store the Administrator in the Session
			session.put( Struts2InsuranceAdminConstants.ADMINISTRATOR, administrator );
		}
        

        return SUCCESS;
    }

    private Object getAdministratorService() {
    	return new AdministratorService();
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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	

}
