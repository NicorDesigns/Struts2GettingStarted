<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Hello World</title>
</head>

<body>
	<hr>
	<h3>Custom Hello World Greeting Page</h3>
	<h4>
		<s:property value="messageStore.message" /><s:property value="customGreeting" />
	</h4>
	<hr>
</body>

</html>
