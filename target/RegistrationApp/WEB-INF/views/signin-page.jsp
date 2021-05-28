<%--
  Created by IntelliJ IDEA.
  User: jwhua
  Date: 5/26/2021
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User sign-in</title>
  <style>
    .errors{
      color: red;
      position: fixed;
      margin-left: 5px;
    }
  </style>
</head>
<body>
<h1>Sign-In Page</h1>
<form:form action="signin-user" method="POST" modelAttribute="userInfo">
  <p>
    <label>Username: </label>
    <form:input path="userName" />
    <form:errors path="userName" cssClass="errors"/>
  </p>
  <br/>
  <p>
    <label>Password: </label>
    <form:password path="userPassword"/>
    <form:errors path="userPassword" cssClass="errors"/>
  </p>
  <br/>
  <input type="submit" value="sign in">
</form:form>
</body>
</html>
