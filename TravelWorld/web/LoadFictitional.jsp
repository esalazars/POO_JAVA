<%@ include file="header.jsp" %>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">${message["w1"]}</h1>
            <p>${message["w2"]}</p>
            <p>${data}</p>
        </div>

    </div>
    <div class="container">
        <div class="row">
            <p>Imprimiendo resultados de la carga de datos <br></p>
                <c:if test="${dataClients==true}">
                    <c:if test="${not empty clients}">
                    <p>Imprimiendo resultados de la carga de datos------Clientes cargados</p>        
                    <c:forEach items="${clients}" var="cliente">
                        <div class="col-md-4">
                            <h2>Nombre: ${cliente.value.getName()}</h2>
                            <p>${cliente.value.getDocument_type}: ${cliente.value.getId()}</p>
                            <p>Direccion: ${cliente.value.getDirection()}</p>                                                 
                        </div>
                    </c:forEach>
                </c:if>                    
            </c:if>
            <c:if test="${dataAirlines==true}">
                <c:if test="${not empty airlines}">
                    <p>Imprimiendo resultados de la carga de datos------Aerolineas cargados<br></p>  
                </c:if>
            </c:if>
            <c:if test="${dataFly==true}">
                <c:if test="${not empty flights}">
                    <p>Imprimiendo resultados de la carga de datos------Vuelos cargados<br></p>   
                    <c:forEach items="${flights}" var="vuelo" >
                        <div class="col-md-4">
                            <h2>${vuelo.value.getDepartureCity()} -> ${vuelo.value.getArrivalCity()}</h2>
                            <p>${vuelo.value.getCode()}</p>
                            <p>value = ${vuelo.value} </p>
                            <p>${vuelo.value.getCode()}</p>                                                 
                        </div>
                    </c:forEach> 
                </c:if>
            </c:if>
            <hr>
        </div>
    </div> <!-- /container -->

</main>

<%@ include file="footer.jsp" %>