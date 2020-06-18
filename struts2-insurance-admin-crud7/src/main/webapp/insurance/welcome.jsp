<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Welcome Page</title>
</head>
<body>
<h3>Welcome Administrator: <s:property value="username"></s:property></h3>
<hr>
	<ul>
		<li>
			<a href="<s:url action='/insurance/list'>
					 <s:param name="request_locale">en</s:param>
					 </s:url>">
		
					<s:text	name="listagents"></s:text>
			</a>
		</li>
	</ul>
<hr>

</body>
</html>