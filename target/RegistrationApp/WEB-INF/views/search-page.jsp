<%--
  Created by IntelliJ IDEA.
  User: jwhua
  Date: 5/27/2021
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Page</title>
</head>
<body>
    <h1>Sign-In Page</h1>
    <form:form action="search-user" method="POST" modelAttribute="userInfo">
        <p>
            <label>Username: </label>
            <form:input path="userName" />
            <form:errors path="userName" cssClass="errors"/>
        </p>
        <br/>
        <p>
            <label>Password: </label>
            <form:password path="userPassword"/>
        </p>
        <br/>
        <input type="submit" value="sign in">
    </form:form>
</body>
</html>
