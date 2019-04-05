<%@ include file="header.jsp" %>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <c:if test="${!empty message}">
                <h1 class="display-3">${message["op1"]}</h1>
            </c:if>
            <c:if test="${empty message}">
                <h1 class="display-3">${Message.ESP["op1"]}</h1>
            </c:if>
            <c:if test="${!empty usuario}">
                <p>${message["sign"]}</p>
            </c:if>
        </div>
    </div>

    <div class="container">
        <!-- Example row of columns -->

        <div class="row">
           
            <form method="POST" action="/Client/LogIn">
                <c:if test="${!empty error}">
                    <p>${message[error]}</p>
                </c:if>
                <table>
                    <tr>
                        <th width="100">${message["data9"]}</th>
                        <td><input type="number" name="id" required/></td>                    
                    </tr>
                    <tr>
                        <th width="100">${message["data7"]}</th>
                        <td><input type="text" name="contra"  required/></td>
                    </tr>
                </table>
                <input type="submit" value="${message["op1"]}"/>
            </form>
        </div>

        <hr>
    </div> <!-- /container -->
</main>

<%@ include file="footer.jsp" %>