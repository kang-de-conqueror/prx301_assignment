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
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <a href="taomoi">Tạo mới</a>
        </div>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
              <c:forEach var="row" items="${requestScope.listItem}">
                    <tr>
                        <td><c:out value="${row.id}"/></td>
                        <td><c:out value="${row.name}"/></td>
                        <td>
                            <a href="chitiet?maso=${row.id}" >Chi tiết</a>
                            <a href="capnhat?maso=${row.id}" >Chỉnh sửa</a>
                            <a href="xoa?maso=${row.id}" >Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
