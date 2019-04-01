<%@ include file="header.jsp" %>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <c:if test="${!empty message}">
                <h1 class="display-3">${message["w1"]}</h1>
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
                    <h2>Heading</h2>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                    <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
                </div>
                 </c:if>  
                <c:if test="${!empty airlines}">
                <div class="col-md-4">
                    <h2>Heading</h2>
                    <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                    <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
                </div>
                <div class="col-md-4">
                    <h2>Heading</h2>
                    <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                    <p><a class="btn btn-secondary" href="#" role="button">View details &raquo;</a></p>
                </div>
                 </c:if>  
            </div>
         
        <hr>
    </div> <!-- /container -->



</main>

<%@ include file="footer.jsp" %>