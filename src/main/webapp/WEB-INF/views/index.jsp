<%-- 
    Document   : index
    Created on : Dec 6, 2018, 11:49:46 AM
    Author     : anis
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Spring Framework !!!</h1>

        <h2>
            <ul>
                <c:forEach var="c" items="${courses}">
                    <li>${c.name} :: ${c.fees}</li>
                    </c:forEach> 

            </ul>
        </h2>
    </body>
</html>
