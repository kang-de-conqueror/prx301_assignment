<%-- 
    Document   : Login
    Created on : Nov 7, 2021, 7:54:00 PM
    Author     : looby
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="text-align: center;padding-top: 10%;">
        <div>
            <h1>Login Page</h1>
            <form action="Login" method="POST">
                Username:<input name="txtusername" type="text"/></br>
                Password:<input name="txtpassword" type="password"/></br>
            <input type="submit" value="Login"/>
            </form>

            
        </div>
    </body>
</html>
