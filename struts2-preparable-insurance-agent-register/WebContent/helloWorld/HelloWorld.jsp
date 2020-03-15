<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="hellotitle" /></title>
</head>

<body>
	<hr>
	<h3><s:text name="hellogreeting" /></h3>
	<h4>
		<s:property value="messageStore.message" /><s:property value="customGreeting" />
	</h4>
	<hr>
</body>

</html>
