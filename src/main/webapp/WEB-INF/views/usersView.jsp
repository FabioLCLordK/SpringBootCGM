<%-- 
    Document   : IndexViews
    Created on : 3 apr 2023, 11:21:22
    Author     : LordKazor
--%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <% List <String> users= (List<String>) request.getAttribute("users"); %>
        <h1>Users</h1>
        <ul>
        <% for(String user: users){ %>
        <li><a href="/user/<%= user %>"><%= user %></a></li>
        
        <% }%>
        </ul>
    </body>
</html>
