<%-- 
    Document   : index
    Created on : Dec 6, 2018, 12:23:14 PM
    Author     : anis
--%>

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
                    <label>Name</label>
                    <input type="text" name="name" required="required">
                </div>
                <div>
                    <label>Email</label>
                    <input type="email" name="email" required="required">
                </div>
                <div>
                    <label>Subject</label>
                    <input type="text" name="subject" required="required">
                </div>
                <div>
                    <label>Message</label>
                    <textarea name="message" required="required" style="height: 200px"></textarea>
                </div>
                <div>
                    <label>
                        <input type="checkbox" name="sendMe"/>
                        Send me a copy
                    </label>
                </div>
                <button name="submit" type="submit">Send</button>
            </form>
        </div>
    </body>
</html>
