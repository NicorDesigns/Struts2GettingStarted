<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Enroll a new Insurance Agent</title>
<s:head/>
</head>
<body>

<h3>Enroll a new Insurance Agent.</h3>

    <s:form action="register">
      <!-- Agent Id to display here, not editable -->
      <s:textfield name="agentBean.company" label="Comapny" />
      <s:textfield name="agentBean.firstName" label="First name" />
      <s:textfield name="agentBean.lastName" label="Last name" />
      <s:textfield name="agentBean.midddleInitial"  label ="Middle initial"/>
      <s:textfield name="agentBean.addressLine1"  label ="Address Line 1"/>
      <s:textfield name="agentBean.addressLine2"  label ="Address Line 2"/>
      <s:textfield name="agentBean.city"  label="City"  />
      <!-- State to be populated with a dropdown -->
      <s:textfield name="agentBean.postalCodeZip"  label="Postal Code"  />
      <s:textfield name="agentBean.email"  label="Email"  />
      <!-- Agent isActive Checkbox to Display here -->
      <s:textfield name="agentBean.phoneNumber"  label="Phone Number"  />
      
      <s:submit/>
    </s:form>	
</body>
</html>