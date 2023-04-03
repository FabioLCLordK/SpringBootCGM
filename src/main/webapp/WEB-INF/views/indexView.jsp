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
        <h1>Benvenuto!</h1>
        <!-- modo semplice
        <form action="/user" method="POST">
            <input type="text" name="firstname" placeholder="inserisci il tuo nome"> 
            <input type="text" name="lastname" placeholder="inserisci il tuo cognome"> 
            <input type="text" name="email" placeholder="inserisci la tua email"> 
            <input type="text" name="password" placeholder="inserisci la tua password"> 
            <input type="submit" value="Iscriviti"> 
        </form>
        -->
         <form action="/user" method="POST">
            <label for="firstname"> inserisci il tuo nome </label>
            <input id="firstname" type="text" name="firstname"> 
            <label for="lastname"> inserisci il tuo cognome </label>
            <input type="text" name="lastname"> 
         </form>
        <form>
            <label for="email">inserisci la tua email </label>
            <input type="text" name="email"> 
            <label for="password">inserisci la tua password</label>
            <input type="text" name="password"> 
    
            <input type="submit" value="Iscriviti"> 
        </form>
       
    </body>
</html>
