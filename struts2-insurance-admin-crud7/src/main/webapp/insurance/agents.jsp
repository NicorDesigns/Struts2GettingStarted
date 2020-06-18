<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <s:head />
        <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
        <title><s:text name="label.agents"/></title>
    </head>
<body>
	<div class="titleDiv"><s:text name="application.title"/></div>
    <h1><s:text name="label.agents"/></h1>
     <s:url var="url" action="showAgent" />
    <br/><br/>
        <table class="borderAll">
            <tr>
                <th><s:text name="agent.firstName"/></th>
                <th><s:text name="agent.lastName"/></th>
                <th><s:text name="agent.midddleInitial"/></th>
                <th><s:text name="agent.addressLine1"/></th>
                <th><s:text name="agent.addressLine2"/></th>
                <th><s:text name="agent.city"/></th>
                <th><s:text name="agent.stateId"/></th>
                <th><s:text name="agent.postalCodeZip"/></th>
                <th><s:text name="agent.email"/></th>
                <th><s:text name="agent.company"/></th>
                <th><s:text name="agent.isActive"/></th>
                <th><s:text name="agent.isExpensed"/></th>
                <th>&nbsp;</th>
            </tr>
            <s:iterator value="agents" status="status">
                <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
                    <td class="nowrap"><s:property value="firstName"/></td>
                    <td class="nowrap"><s:property value="lastName"/></td>
                    <td class="nowrap"><s:property value="midddleInitial"/></td>
                    <td class="nowrap"><s:property value="addressLine1"/></td>
                    <td class="nowrap"><s:property value="addressLine2"/></td>
                    <td class="nowrap"><s:property value="city"/></td>
                    <td class="nowrap"><s:property value="stateId"/></td>
                    <td class="nowrap"><s:property value="postalCodeZip"/></td>
                    <td class="nowrap"><s:property value="email"/></td>
                    <td class="nowrap"><s:property value="company"/></td>
                    <td class="nowrap">
                        <s:if test="isActive">
                            <span style="color:green; font-size: large;">&#x2714;</span>
                        </s:if>
                        <s:else>
                            <span style="color:red; font-size: large;">&#x2717;</span>
                        </s:else>                        
                    </td>
                    <td class="nowrap">
                        <s:if test="isExpensed">
                            <span style="color:green; font-size: large;">&#x2714;</span>
                        </s:if>
                        <s:else>
                            <span style="color:red; font-size: large;">&#x2717;</span>
                        </s:else>                        
                    </td>
                    <td class="nowrap">
                        <s:url action="showAgent" var="url">
                            <s:param name="agentId" value="id"/>
                        </s:url>
                        <a href="<s:property value="#url"/>">Edit</a>
                        &nbsp;&nbsp;&nbsp;
                    </td>
                </tr>
            </s:iterator>
        </table>
    
        

</body>
</html>