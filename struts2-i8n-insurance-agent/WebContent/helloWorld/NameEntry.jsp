<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<head>
<title><s:text name="hellonameentry"/></title>
</head>

<body>
	<hr>
	<h4><s:text name="hellopleasenter"/></h4>
	<s:form action="HelloWorld">
		<s:textfield name="name" label="Your name" />
		<s:submit />
	</s:form>
	<hr>
</body>

</html>
