<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<h2>Hello World!</h2>

		<s:url var="url" action="insurance/home">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{url}">English language Login</s:a>
</body>
</html>
