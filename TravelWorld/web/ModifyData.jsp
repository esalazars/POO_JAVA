<%@ include file="header.jsp" %>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <c:if test="${!empty message}">
                <h1 class="display-3">${message["op5"]}</h1>
                <p>${message["w2"]}</p>
            </c:if>
            <c:if test="${empty message}">
                <h1 class="display-3">${Message.ESP["op5"]}</h1>
                <p>${Message.ESP["w2"]}</p>
            </c:if>
        </div>
    </div>

    <div class="container">
        <!-- Example row of columns -->

        <div class="row">

            <form method="POST" action="/Client/ModifyData">
                <table>
                    <tr>
                    <th width="213">${message["data1"]}</th>
                    <th> <input type="text" name="nombre" value="${usuario.getName()}" required/> </th> 
                    </tr>
                </table>
                <table>
                    <tr>
                    <th width="213">${message["data5"]}</th>
                    <th> <input type="email" name="email" value="${usuario.getCorreo()}" required/> </th>
                    </tr>
                </table>
                <table>
                    <tr>
                    <th width="213">${message["data2"]}</th>
                    <th> <input type="text" name="pais" value="${usuario.getCountry()}" required/> </th>
                    </tr>
                </table>
                <table>
                    <tr>  
                    <th width="213">${message["data3"]}</th>
                    <th> <input type="number" name="telefono" value="${usuario.getPhone()}" required/> </th>
                    </tr>
                </table>
                <table>
                    <tr>

                    <th width="213">${message["data6"]}</th>
                    <th> <input  type="text" name="direccion" value="${usuario.getDirection()}" required/> </th>
                    </tr>
                </table>
                <table>
                    <tr>
                    <th width="213">${message["data4"]}</th>
                    <th> <input type="text" name="fecha_de_nacimiento" value="${usuario.getBirthdate()}" required/> </th>  
                    </tr>
                </table>
                <table>
                    <tr>
                    <th width="213">${message["data8"]}</th>                     
                    <th> <input type="text" name="tipo_documento" value="${usuario.getDocument_type()}" required/> </th>
                    </tr>
                </table>
                <table>
                    <tr>
                    <th width="213">${message["data10"]}</th>
                    <th> <input type="text" name="sexo" value="${usuario.getSex()}" required/> </th>
                    </tr>
                </table>
                <input type="submit" value="Guardar" />
            </form>
        </div>

        <hr>
    </div> <!-- /container -->



</main>

<%@ include file="footer.jsp" %>