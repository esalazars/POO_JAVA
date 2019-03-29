<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>        
        <link rel="shortcut icon" href="/flavicon.png" type="image/x-icon">        
        <link rel="stylesheet" type="text/css" href="<c:url value = "/css/bootstrap.min.css"/>" />
        <link rel="stylesheet" type="text/css" href="<c:url value = "/css/style.css"/>" />       
        <title>Travel World</title>
    </head>
    <body>
        
        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="/index">Travel World</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="/Exito">${Lenguage["op1"]}</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link " href="#">Vuelos</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Registrarse</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Datos Ficticios</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Idioma</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown01">
                            <c:if test="${empty Lenguage}">
                            <a class="dropdown-item" href="/index?opcion=eng" value="eng">English</a>
                            <a class="dropdown-item" href="/index?opcion=spa" value="esp">Español</a>
                            </c:if>
                        </div>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0" action="/Fly?opcion=search">
                    <input class="form-control mr-sm-2" type="text" placeholder="Buscar Vuelos" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit" >Buscar</button>
                </form>
            </div>
        </nav>    
        