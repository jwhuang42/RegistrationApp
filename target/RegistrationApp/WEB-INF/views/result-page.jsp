<%--
  Created by IntelliJ IDEA.
  User: jwhua
  Date: 5/26/2021
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>

    <title>Result page</title>
</head>
<body>
  <h1>User Profile is successfully created!</h1>
  UserName is: ${userInfo.userName} <br/>
  User password is: ${userInfo.userPassword}<br/>
  User email is: ${userInfo.email}<br/>
  User age is: ${userInfo.age}<br/>
  <a href="/RegistrationApp_war_exploded/mywebsite/greeting" >
    Go back to main page</a>
</body>
</html>
