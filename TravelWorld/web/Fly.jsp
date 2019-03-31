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
                        <h2>${vuelo.value.getDepartureCity()} -> ${vuelo.value.getArrivalCity()}</h2>
                        <p>${vuelo.value.getCode()}</p>
                        <p>value = ${vuelo.value} </p>
                        <p>${vuelo.value.getCode()}</p>                                                 
                    </div>
                </c:forEach> 
            </c:if>
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
            </div>
            
        <hr>

      </div> <!-- /container -->

    </main>

<%@ include file="footer.jsp" %>