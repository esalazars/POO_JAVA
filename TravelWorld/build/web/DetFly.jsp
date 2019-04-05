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
                <div class="col-md-4">
                    <h3>${message["f1"]} ${vuelo.value.getDepartureCity()}<br>${message["f2"]} ${vuelo.value.getArrivalCity()}</h3>
                    <p>${message["f8"]} <time> ${vuelo.value.getDepartureDate()}</time></p>
                    <p>${message["f6"]} ${vuelo.value.getPrice()} </p>

                    <p><a class="btn btn-secondary" value="${vuelo.value.getCode()}" href="/Fly/DetFly" role="button">${message["f15"]}&raquo;</a></p>
                </div>

            </c:if>            
        </div>

        <hr>

    </div> <!-- /container -->

</main>

<%@ include file="footer.jsp" %>