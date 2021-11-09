<%-- 
    Document   : index
    Created on : Oct 28, 2021, 1:07:03 PM
    Author     : Kero
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Car Store</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light justify-content-between">
            <div class="d-flex">
                <a class="nav-link" href="home">Home <span class="sr-only">(current)</span></a>
                <div class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" id="dropdownBrand" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        THƯƠNG HIỆU
                    </a>
                    <div class="dropdown-menu" aria-labelledby="dropdownBrand">
                        <a class="dropdown-item" href="sort?brand=Vinfast">Vinfast</a>
                        <a class="dropdown-item" href="sort?brand=Toyota">Toyota</a>
                        <a class="dropdown-item" href="sort?brand=Mercedes">Mercedes</a>
                        <a class="dropdown-item" href="sort?brand=Mitsubishi">Mitsubishi</a>
                    </div>
                </div>
<!--                <div>
                    <a class="nav-link dropdown-toggle" href="#" role="button" id="dropdownPrice" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        GIÁ CẢ
                    </a>
                    <div class="dropdown-menu" aria-labelledby="dropdownPrice">
                        <a class="dropdown-item" href="SortPrice1">Dưới 100tr</a>
                        <a class="dropdown-item" href="SortPrice2">Từ 100tr - 200tr</a>
                        <a class="dropdown-item" href="SortPrice3">Trên 200tr</a>
                    </div>
                </div>-->
                <a class="nav-link" href="create_product.jsp" >Create new product</a>
                <a class="btn btn-danger" href="logout" >Logout</a>
            </div>
            <form class="form-inline my-2 my-lg-0" method="GET" action="search">
                <input class="form-control mr-sm-2" type="search" name="name" placeholder="Search product" aria-label="Search product">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </nav>

        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th>Tên</th>
                        <th>Hình ảnh</th>
                        <th>Thương hiệu</th>
                        <th>Màu</th>
                        <th>Giá</th>
                        <th>Số lượng còn trong kho</th>
                    </tr>
                </thead>
                <tbody>

                    <c:forEach var="p" items="${sessionScope.products}">
                        <tr class="right-content">

                            <td><c:out value="${p.getName()}"/></td>
                            <td>
                                <img src="<c:out value="${p.getImgUrl()}"/>" width="250px" />
                            </td>
                            <td><c:out value="${p.getBrand()}"/></td>
                            <td><c:out value="${p.getColor()}"/></td>
                            <td><c:out value="${p.getPrice()}"/></td>
                            <td><c:out value="${p.getQuantity()}"/></td>
                            <td>
                                <a href="update_product?id=${p.getId()}&action=Redirect" >Edit</a>
                            </td>
                            <td>
                                <a href="delete_product?id=${p.getId()}" >Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>
