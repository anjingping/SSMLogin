<%--
  Created by IntelliJ IDEA.
  User: 安京平
  Date: 2018/9/26 0026
  Time: 0:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <form action="/register.action" method="post">
        账号<input type="text" name="name"/><br>
        密码<input type="password" name="password"/><br>
        年龄<input type="text" name="age"/><br>
        性别<input type="text" name="sex"/><br>
        <input type="submit" value="注册"/>
        <input type="reset" value="重置"/>
    </form>
</body>
</html>
