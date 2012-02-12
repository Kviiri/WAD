<%-- 
    Document   : listaus
    Created on : 12-Feb-2012, 11:30:03
    Author     : kviiri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listaus</title>
    </head>
    <body>
        <h1>Myytävänä olevat asunnot:</h1>
        <c:forEach var="asunto" items="${asunnot}">
            <a href="asunto/${asunto.id}">${asunto.osoite}, ${asunto.postinumero} ${asunto.kaupunki}, rakennettu ${asunto.vuosi}, ${asunto.koko} neliötä, kunto ${asunto.kunto}</a> <br />
        </c:forEach>
    </body>
</html>
