<%-- 
    Document   : create_product
    Created on : Nov 9, 2021, 3:56:18 AM
    Author     : Peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Product</title>
    </head>
    <body>
        <h1>Create Product</h1>
        <form method="POST" action="create_product">
            Id: <input type="text" name="id" placeholder="Input id" /></br>
            Name: <input type="text" name="name" placeholder="Input name" /></br>
            Brand: <input type="text" name="brand" placeholder="Input brand" /></br>
            Color: <input type="text" name="color" placeholder="Input color" /></br>
            Price: <input type="text" name="price" placeholder="Input price" /></br>
            Quantity: <input type="text" name="quantity" placeholder="Input quantity" /></br>
            <input type="submit" value="Confirm" />
        </form>
    </body>
</html>
