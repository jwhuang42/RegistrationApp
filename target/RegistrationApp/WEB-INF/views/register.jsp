<%--
  Created by IntelliJ IDEA.
  User: jwhua
  Date: 5/26/2021
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>User Registration</title>
  <style>
    .errors{
      color: red;
      position: fixed;
      margin-left: 5px;
    }
  </style>
</head>
<body>
  <h1 align="center">Sign Up</h1>
  <form:form action="signup-user" method="get" modelAttribute="userInfo">
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
    <p>
      <label>Email: </label>
      <form:input path="email" />
      <form:errors path="email" cssClass="errors"/>
    </p>
    <br/>
    <p>
      <label>Age: </label>
      <form:input path="age" />
      <form:errors path="age" cssClass="errors"/>
    </p>
    <br/>
    <p>
      <label>please agree to term .......  </label>
      <form:checkbox path="agreedToTerms" />
      <form:errors path="agreedToTerms" cssClass="errors"/>
    </p>
    <br/>
    <input type="submit" value="register">
  </form:form>
</body>
</html>
