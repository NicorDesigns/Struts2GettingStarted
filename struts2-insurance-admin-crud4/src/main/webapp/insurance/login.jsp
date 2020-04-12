<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<s:head/>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Page</title>
</head>
<body>
<h3>Welcome User, please login below</h3>
<s:form action="Login">
    <s:textfield key="username" label="Administrator Name"/>
    <s:password key="password" label="Password" type="password" />
    <s:submit/>
</s:form>
</body>
</html>