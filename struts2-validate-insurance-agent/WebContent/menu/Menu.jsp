<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="menutitle"/></title>
</head>

<body>

	<hr>
	<ul>
		<li><a href="<s:url action='helloWorld/helloInput'/>"><s:text name="helloworld"/></a></li>
		<li><a href="<s:url action='InsuranceAgent/registerInput'/>"><s:text name="helloenrollagent"></s:text></a></li>
	</ul>
	<hr>
</body>

</html>
