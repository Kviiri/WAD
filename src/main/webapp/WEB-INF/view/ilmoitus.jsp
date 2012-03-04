<%-- 
    Document   : ilmoitus
    Created on : 12-Feb-2012, 11:29:50
    Author     : kviiri
--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uusi ilmoitus</title>
    </head>
    <body>
        <a href="listaus.jsp">Listaukseen</a><br />
        <h1>Lisää ilmoitus</h1>
        <form:form commandName="FormObject" action="${pageContext.request.contextPath}/ilmoitus" method="POST">
            <h3>Myyjän tiedot</h3>
            Nimi: <form:input path="nimi"/><form:errors path="nimi"/> <br />
            Puhelinnumero: <form:input path="puhelinnumero"/><form:errors path="puhelinnumero"/> <br />
            Sähköpostiosoite: <form:input path="sahkopostiosoite"/><form:errors path="sahkopostiosoite"/><br />
            
            <h3>Asunnon tiedot</h3>
            Koko (kokonaisluku, neliömetreinä): <form:input path="koko"/><form:errors path="koko"/><br />
            Postinumero: <form:input path="postinumero"/><form:errors path="postinumero"/><br />
            Kaupunki: <form:input path="kaupunki"/><form:errors path="kaupunki"/><br />
            Katuosoite: <form:input path="osoite"/><form:errors path="osoite"/><br />
            Rakennusvuosi: <form:input path="vuosi"/><form:errors path="vuosi"/><br />
            Asunnon kunto <br />
            Hyvä <form:radiobutton path = "kunto" value = "hyvä"></form:radiobutton><br />
            Keskiverto <form:radiobutton path = "kunto" value = "keskiverto"></form:radiobutton><br />
            Huono <form:radiobutton path = "kunto" value = "huono"></form:radiobutton><br />
            Remontoitava <form:radiobutton path = "kunto" value = "remontoitava"></form:radiobutton><br />
            <input type="submit" value="Lähetä" />
        </form:form>
    </body>
</html>