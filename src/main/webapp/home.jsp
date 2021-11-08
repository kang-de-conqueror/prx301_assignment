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
        <link rel="stylesheet" type="text/css" href="css\main.css"/>
    </head>
    <body>
        <h1>Car Management</h1>
        <ul class="ul-view">
            <li class="left-menu">

                <ul style="list-style-type: none;display: list-item;">
                    <a href="view">TẤT CẢ SẢN PHẨM</a>
                    THƯƠNG HIỆU
                    <li><a href="SortByVin">Vinfast</a></li>
                    <li><a href="SortByToyota">Toyota</a></li>
                    <li><a href="SortByMercedes">Mercedes</a></li>
                    <li><a href="SortByMitsubishi">Mitsubishi</a></li>
                    GIÁ
                    <li><a href="SortPrice1">Dưới 100tr</a></li>
                    <li><a href="SortPrice2">Từ 100tr - 200tr</a></li>
                    <li><a href="SortPrice3">Trên 200tr</a></li>
                    <a href="">THÊM SẢN PHẨM</a>
                </ul>
            </li>
            <li>
                <div class="content-view">
                    <a href="create_product.jsp" >Create new product</a>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Tên</th>
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
                                    <td><c:out value="${p.getBrand()}"/></td>
                                    <td><c:out value="${p.getColor()}"/></td>
                                    <td><c:out value="${p.getPrice()}"/></td>
                                    <td><c:out value="${p.getQuantity()}"/></td>
<!--                                    <td>
                                        <a href="BuyProductController?id=${p.getId()}" >Buy</a>
                                        <a href="detail?id=${p.getId()}" >View</a>
                                    </td>-->
                                    <td>
                                        <a href="update_product?id=${p.getId()}" >Edit</a>
                                    </td>
                                    <td>
                                        <a href="delete_product?id=${p.getId()}" >Delete</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div></li>
        </ul>

    </body>
</html>
