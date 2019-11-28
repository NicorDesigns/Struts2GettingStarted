<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    
<title>Enrollment Successful</title>
</head>
<body>
	<h3>Insurance Agent Registration Successful.</h3>

    <p>Your registration information: <s:property value="agentBean" /> </p>

    <p><a href="<s:url action='../Menu' />" >Return to home page</a>.</p>
</body>
</html>