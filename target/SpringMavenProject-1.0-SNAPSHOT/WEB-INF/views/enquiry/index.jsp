<%-- 
    Document   : index
    Created on : Dec 6, 2018, 12:23:14 PM
    Author     : anis
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Contact</h1>
        <div>
            <form method="post" action="">
                <div>
                    <label>First Name</label>
                    <input type="text" name="firstName" required="required">
                </div>
                <div>
                    <label>Last Name</label>
                    <input type="text" name="lastName" required="required">
                </div>
                <div>
                    <label>Email</label>
                    <input type="email" name="email" required="required">
                </div>
                <div>
                    <label>Contact No</label>
                    <input type="text" name="contactNo" required="required">
                </div>
                <div>
                    <label>Course</label>
                    <select name="courseId">
                        <option value="">Select Course</option>
                        <c:forEach var="c" items="${courses}">
                            <option value="${c.id}">${c.name}</option>
                        </c:forEach>
                    </select>
                </div>                
                <button name="submit" type="submit">Send</button>
            </form>
        </div>
    </body>
</html>
