<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:if test="agent==null || agent.Id == null">
    <s:set var="title" value="%{'Add New Insurance Agent'}"/>
</s:if>
<s:else>
    <s:set var="title" value="%{'Update Existing Insurance Agent'}"/>
</s:else>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
        <s:head />
        <link href="<s:url value='../css/main.css'/>" rel="stylesheet" type="text/css"/>
        <style>td { white-space:nowrap; }</style>
        <title><s:property value="#title"/></title>
    </head>

<body>
 <div class="titleDiv"><s:text name="application.title"/></div>
        <h1><s:property value="#title"/></h1>
        <s:actionerror />
        <s:actionmessage />
    <s:url var="url" action="cancelAgent" />    
    <s:form action="saveAgent" method="post">
      <s:textfield key="agent.company" />
      <s:textfield key="agent.firstName" />
      <s:textfield key="agent.lastName" />
      <s:textfield key="agent.midddleInitial" />
      <s:textfield key="agent.addressLine1" />
      <s:textfield key="agent.addressLine2" />
      <s:textfield key="agent.city" />
      <s:select name="agent.state.stateId" list="states" listKey="stateId" listValue="stateName" label="%{getText('agent.state')}"/>
      <s:textfield key="agent.postalCodeZip" />
      <s:textfield key="agent.email" />
      <s:checkbox key="agent.active" />
      <s:checkbox key="agent.expensed" />
      <s:hidden name="agent.Id" value="%{agent.Id}"/>
      
      <s:submit value="%{getText('button.label.submit')}"/>
  </s:form>
  	   &nbsp;&nbsp;&nbsp;
                        <s:url action="cancelAgent" var="url">
                            <s:param name="agentId" value="%{agent.Id}"/>
                        </s:url>
                        <a href="<s:property value="#url" />">cancel</a>
                       		
</body>
</html>