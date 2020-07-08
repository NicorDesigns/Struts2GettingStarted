package com.nicordesigns.insurance.admin.utils;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nicordesigns.insurance.admin.Struts2InsuranceAdminConstants;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthenticationInterceptor implements Interceptor {

	private static final long serialVersionUID = -3021543167104072922L;
	
	private static final Logger logger = LogManager.getLogger(AdministratorService.class);


	public void destroy() {
	}

	public void init() {
	}

	public String intercept(ActionInvocation actionInvocation) throws Exception {

		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();

		Administrator Administrator = (Administrator) session.get(Struts2InsuranceAdminConstants.ADMINISTRATOR);

		if (Administrator == null) {
			return Action.LOGIN;
		} else {

			Action action = (Action) actionInvocation.getAction();

			if (action instanceof AdministratorAware) {
				((AdministratorAware) action).setAdministrator(Administrator);
			}
			
			logger.debug("Logged in: interceptor");
			return actionInvocation.invoke();
		}

	}

}
