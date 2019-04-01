<%@ include file="header.jsp" %>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">${message["load0"]}</h1>
            <p>${message[load1]}</p>
            <p><a class="btn btn-primary btn-lg" href="/index" role="button">${message["load11"]}</a></p>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <!-- Aerolineas-->
            <div class="col-md-4">
                <h2>${message["load8"]}</h2>
                <c:if test="${dataAirlines==true}">
                    <c:if test="${not empty airlines}">
                        <p>${message["load9"]}</p>                       
                    </c:if>
                    <c:if test="${empty airlines}">
                        <p>${message["load10"]}</p>                       
                    </c:if>   
                </c:if>
            </div> 
            <!-- Vuelos-->
            <div class="col-md-4">
                <h2>${message["load5"]}</h2>
                <c:if test="${dataFly==true}">
                    <c:if test="${not empty flights}">
                        <p>${message["load6"]}</p>                       
                    </c:if>
                        <c:if test="${empty flights}">
                        <p>${message["load7"]}</p>                       
                    </c:if>
                </c:if>
            </div>
            <!-- Clientes-->
            <div class="col-md-4">
                <h2>${message["load2"]}</h2>
                <c:if test="${dataClients==true}">
                    <c:if test="${not empty clients}">
                        <p>${message["load3"]}</p>                       
                    </c:if>
                    <c:if test="${empty clients}">
                        <p>${message["load4"]}</p>                       
                    </c:if>
                </c:if>
            </div> 
        </div>
        <hr>
    </div> <!-- /container -->

</main>

<%@ include file="footer.jsp" %>