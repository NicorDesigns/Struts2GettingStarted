<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>enroll</title>
<s:head/>
</head>
<body>

<h3>enroll</h3>

    <s:form action="register">
      <!-- Agent Id to display here, not editable -->
      <s:textfield key="agentBean.company" />
      <s:textfield key="agentBean.firstName" />
      <s:textfield key="agentBean.lastName" />
      <s:textfield key="agentBean.midddleInitial"/>
      <s:textfield key="agentBean.addressLine1"/>
      <s:textfield key="agentBean.addressLine2"/>
      <s:textfield key="agentBean.city"/>
      <!-- State to be populated with a dropdown -->
      <s:textfield key="agentBean.postalCodeZip" />
      <s:textfield key="agentBean.email" />
      <!-- Agent isActive Checkbox to Display here -->
      <s:textfield key="agentBean.phoneNumber" />
      <s:submit key="submit"/>
    </s:form>	
</body>
</html>