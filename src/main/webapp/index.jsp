<%--
  Created by IntelliJ IDEA.
  User: 安京平
  Date: 2018/9/26 0026
  Time: 0:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <form action="/login.action" method="post">
        账号<input type="text" name="name"/><br>
        密码<input type="password" name="password"/><br>
        <input type="submit" value="登录"/>
        <button type="button" onclick="window.location.href='register.jsp'">注册</button>
    </form>
</body>
</html>
