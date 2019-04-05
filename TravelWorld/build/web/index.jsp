<%@ include file="header.jsp" %>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <c:if test="${!empty message}">
                <h1 class="display-3">${message["w1"]}  <c:if test="${!empty usuario}">${usuario.getName()}</c:if></h1>
                <p>${message["w2"]}</p>
            </c:if>
            <c:if test="${empty message}">
                <h1 class="display-3">${Message.ESP["w1"]}</h1>
                <p>${Message.ESP["w2"]}</p>
            </c:if>
        </div>
    </div>

    <div class="container">
        <!-- Example row of columns -->

        <div class="row">
            <c:if test="${!empty flights}">
                <div class="col-md-4">
                    <h2>${message["op2"]}</h2>                    
                    <p><a class="btn btn-secondary" href="/Fly" role="button">${message["f15"]} &raquo;</a></p>
                </div>
            </c:if>  
            <c:if test="${!empty airlines}">
                <div class="col-md-4">
                    <h2>${message["op8"]}</h2>                    
                    <p><a class="btn btn-secondary" href="./Airlines" role="button">${message["f15"]} &raquo;</a></p>
                </div>
            </c:if>  
            <!--
            <c:if test="${!empty clients}">
                <div class="col-md-4">
                    <h2>${message["load3"]}</h2>                    
                    <p><a class="btn btn-secondary" href="./index" role="button">View details &raquo;</a></p>
                </div>
            </c:if>-->

        </div>

        <hr>
    </div> <!-- /container -->



</main>

<%@ include file="footer.jsp" %>