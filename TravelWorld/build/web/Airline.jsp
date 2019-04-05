<%@ include file="header.jsp" %>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">${message["op8"]}</h1>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <c:if test="${!empty airlines}" >  
                <!-- Example row of columns -->
                <c:forEach items="${airlines}" var="aero" >
                    <div class="col-md-4">
                        <h3>${message["data1"]} ${aero.value.getNombre()}<br><h3>
                        <p>${message["data13"]} ${aero.value.getSede()}</p>                        
                        <p>${message["data14"]} ${aero.value.getCalPromedio()} </p>                        
                        <p><a class="btn btn-secondary"  href="/Airlines" role="button">${message["f15"]}&raquo;</a></p>
                    </div>
                </c:forEach> 
            </c:if>            
        </div>
        <hr>

    </div> <!-- /container -->

</main>

<%@ include file="footer.jsp" %>