<%-- 
    Document   : update_product
    Created on : Nov 9, 2021, 1:11:23 AM
    Author     : Peter
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Product</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    </head>
    <body>
        <div class="container">

            <h1>Update Product</h1>
            <form method="POST" action="update_product">
                <div class="form-group row">
                    <label for="inputId" class="col-sm-2 col-form-label">Id:</label>
                    <div class="col-sm-10">
                        <input type="text" readonly  class="form-control" name="id" id="inputId" value="<c:out value="${requestScope.productUpdate.getId()}"/>">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputName" class="col-sm-2 col-form-label">Name:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="name" id="inputName" value="<c:out value="${requestScope.productUpdate.getName()}"/>">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputBrand" class="col-sm-2 col-form-label">Brand</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="brand" id="inputBrand" value="<c:out value="${requestScope.productUpdate.getBrand()}"/>">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputColor" class="col-sm-2 col-form-label">Color:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="color" id="inputColor" value="<c:out value="${requestScope.productUpdate.getColor()}"/>">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputPrice" class="col-sm-2 col-form-label">Price:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="price" id="inputPrice" value="<c:out value="${requestScope.productUpdate.getPrice()}"/>">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputQuantity" class="col-sm-2 col-form-label">Quantity:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="quantity" id="inputQuantity" value="<c:out value="${requestScope.productUpdate.getQuantity()}"/>">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputImgUrl" class="col-sm-2 col-form-label">Image url:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="imgUrl" id="inputImgUrl" value="<c:out value="${requestScope.productUpdate.getImgUrl()}"/>">
                    </div>
                </div>
                <input class="btn btn-primary" type="submit" name="action" value="Update" />
            </form>
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>
