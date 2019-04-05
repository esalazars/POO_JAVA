<%@ include file="header.jsp" %>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">${message["op2"]}</h1>
            <p>${message["f0"]}</p>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <c:if test="${!empty flights}" >  
                <!-- Example row of columns -->
                
                <c:forEach items="${flights}" var="vuelo" >
                    <div class="col-md-4">
                        <h3>${message["f1"]} ${vuelo.value.getDepartureCity()}<br>${message["f2"]} ${vuelo.value.getArrivalCity()}</h3>
                        <p>${message["f8"]} <time> ${vuelo.value.getDepartureDate()}</time><br>
                            ${message["f14"]} <time> ${vuelo.value.getBoardingTime()}</time><br>
                            ${message["f9"]} <time> ${vuelo.value.getArrivalDate()}</time><br>
                            ${message["f3"]} ${vuelo.value.getDepartureAirport()}<br>
                            ${message["f4"]} ${vuelo.value.getArrivalAirport()}<br>
                            ${message["f6"]} ${vuelo.value.getPrice()}<br>
                            ${message["f5"]} ${vuelo.value.getCode()}<br>
                        </p>

                        <p><a class="btn btn-secondary" href="/Fly/DetFly" role="button" >${message["buy"]}&raquo;</a></p>

                    </div>
                </c:forEach> 
            </c:if>            
        </div>

        <hr>

    </div> <!-- /container -->

</main>

<%@ include file="footer.jsp" %>