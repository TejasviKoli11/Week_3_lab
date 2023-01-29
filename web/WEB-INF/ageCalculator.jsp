<%-- 
    Document   : ageCalculator
    Created on : 27 Jan, 2023, 6:14:24 PM
    Author     : Tejasvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            
            <input type="submit" value="Age next birthday"><br>
            
            <p> Your age is: ${age}</p>
            
            
        </form> 
            
        <a href="arithmetic">Arithmetic Calculation</a>
        
        
        
    </body>
</html>
