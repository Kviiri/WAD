<%-- 
    Document   : asunto
    Created on : 12-Feb-2012, 12:35:10
    Author     : kviiri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asunnon tiedot</title>
    </head>
    <body>
        <h1>Asunnon tiedot</h1>
        ${asunto.osoite}<br/>
        ${asunto.postinumero}<br/>
        ${asunto.kaupunki}<br/>
        Rakennettu ${asunto.vuosi}<br/>
        ${asunto.koko}m²<br/>
        Asunnon kunto on ${asunto.kunto} <br/>
        
        <h1>Myyjän tiedot</h1>
        ${asunto.henkilo.nimi}<br/>
        ${asunto.henkilo.sahkopostiosoite}<br/>
        ${asunto.henkilo.puhelinnumero}
    </body>
</html>
