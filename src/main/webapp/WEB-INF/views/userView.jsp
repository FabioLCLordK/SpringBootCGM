<%-- 
    Document   : IndexViews
    Created on : 3 apr 2023, 11:21:22
    Author     : LordKazor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>USER</h1>
        <p><%= request.getAttribute("firstname") %> </p>
    </body>
</html>
