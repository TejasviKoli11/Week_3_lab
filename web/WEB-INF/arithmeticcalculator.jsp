<%-- 
    Document   : arithmeticcalculator
    Created on : 29 Jan, 2023, 3:09:30 PM
    Author     : Tejasvi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
        First Number: <input type="text" name="num_one" value=${num1}><br>
        Second Number: <input type="text" name="num_two" value=${num2}><br>
        
        <input type="submit" value="+" name="operation">
        <input type="submit" value="-" name="operation">
        <input type="submit" value="*" name="operation">
        <input type="submit" value="/" name="operation">
        
        <p>${output}</p>
        <p>${result}</p>
        
        </form>
         <a href="age">Age Calculation</a>
    </body>
</html>
