<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    
<title><s:text name="successenroll"/></title>
</head>
<body>
	<h3><s:text name="successenroll"/></h3>

    <p> <s:text name="registerinfo"></s:text> <s:property value="agentBean" /> </p>
    
    <p> <s:text name="registersessioninfo"></s:text> <s:property value="#session['registeredAgent']" /> /> </p>
    
	

    <p><a href="<s:url action='../Menu' />" ><s:text name="returnhomepage"/></a>.</p>
</body>
</html>