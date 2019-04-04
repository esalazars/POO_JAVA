<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" import="util.Message"%>

<html>
    <head>            
        <title>Travel World</title>
        <link rel="stylesheet" type="text/css" href="<c:url value = "/css/bootstrap.min.css"/>" />
        <link rel="stylesheet" type="text/css" href="<c:url value = "/css/style.css"/>" />
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
                        <!-- Vuelos-->
                        <c:if test="${!empty message}">
                            <a class="nav-link" href="/Fly">${message["op2"]}<span class="sr-only">(current)</span></a>
                        </c:if>
                        <c:if test="${empty message}">
                            <a class="nav-link" href="/Fly">${Message.ESP["op2"]}<span class="sr-only">(current)</span></a>
                        </c:if>
                    </li>
                    <li class="nav-item active">
                        <!-- Iniciar Sesion-->
                        <c:if test="${!empty message}">
                            <a class="nav-link" href="/Fly?option=login">${message["op1"]}</a>
                        </c:if>
                        <c:if test="${empty message}">
                            <a class="nav-link" href="/index?option=login">${Message.ESP["op1"]}<span class="sr-only">(current)</span></a>
                        </c:if>
                    </li>
                    <li class="nav-item active">
                        <!-- Registrarse-->
                        <c:if test="${!empty message}">
                            <a class="nav-link" href="/index?option=singup">${message["op3"]}</a>
                        </c:if>
                        <c:if test="${empty message}">
                            <a class="nav-link" href="/index?option=singup">${Message.ESP["op3"]}<span class="sr-only">(current)</span></a>
                        </c:if>
                    </li>
                    <li class="nav-item active">
                        <!-- Cargar datos ficticios-->
                        <c:if test="${!empty message}">
                            <a class="nav-link" href="/Fictitional">${message["op6"]}</a>
                        </c:if>
                        <c:if test="${empty message}">
                            <a class="nav-link" href="/Fictitional">${Message.ESP["op6"]}<span class="sr-only">(current)</span></a>
                        </c:if>                        
                    </li><!--
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${message["id"]}</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown01">
                            <a class="dropdown-item" href="/index?option=esp">${message["id1"]}</a>
                            <a class="dropdown-item" href="/index?option=eng">${message["id2"]}</a>
                        </div>
                    </li>-->
                </ul>
                <form class="form-inline my-2 my-lg-0" action="/Fly?option=searchfly">
                    <c:if test="${!empty message}">
                        <input class="form-control mr-sm-2" type="text" placeholder="${message["b1"]}" aria-label="Search">
                    </c:if>
                    <c:if test="${empty message}">
                        <input class="form-control mr-sm-2" type="text" placeholder="${Message.ESP["b1"]}" aria-label="Search">
                    </c:if>
                    <c:if test="${!empty message}">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">${message["b"]}</button>
                    </c:if>
                    <c:if test="${empty message}">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">${Message.ESP["b"]}</button>
                    </c:if>
                    <!-- Si hay usuario registrado mostrara estas opciones o al menos esa es la idea-->
                    <c:if test="${!empty login}">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${message["op0"]}</a>
                            <div class="dropdown-menu" aria-labelledby="dropdown01">
                                <a class="dropdown-item" href="/Client?option=profile">${message["prof"]}</a>
                                <a class="dropdown-item" href="/Client?option=closeSession">${message["op4"]}</a>
                                <a class="dropdown-item" href="/Client?option=modifyData">${message["op5"]}</a>
                                <a class="dropdown-item" href="/Client?option=history">${message["op7"]}</a>
                            </div>
                        </li>
                    </c:if>
                </form>
            </div>
        </nav>
