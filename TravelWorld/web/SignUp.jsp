<%@ include file="header.jsp" %>

<main role="main">

    <div class="jumbotron">
        <div class="container">
            <c:if test="${!empty message}">
                <h1 class="display-3">${message["op3"]}</h1>
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
        <h2>${message["data"]}</h2>
        <c:if test="${!empty error}">
            <p>${message[error]}</p>
        </c:if>
        <c:if test="${user==false or empty user}">
            <div class="row">

                <form method="POST" action="/Client/SignUp">
                    <!--Id-->
                    <table>
                        <th width="100">${message["data9"]}</th>
                        <th width="100"><input type="number" name="id" required/></th>
                    </table>
                    <!--Nombre-->
                    <table>
                        <th width="100">${message["data1"]}</th>                    
                        <th width="100"><input type="text" name="nombre" required/></th>
                    </table>
                    <!--Pais-->
                    <table>
                        <th width="100">${message["data2"]}</th>
                        <th width="100"><input type="text" name="pais" required/> </th>
                    </table>
                    <!--Numero telefonico-->
                    <table>
                        <th width="100">${message["data3"]}</th>
                        <th width="100"><input type="number" name="telefono" required/></th>
                    </table>
                    <!--Fecha nacimiento-->
                    <table>
                        <th width="100">${message["data4"]}</th>
                        <th width="100"><input type="text" name="fecha_de_nacimiento" required/></th>
                    </table>
                    <!--Email-->
                    <table>
                        <th width="100">${message["data5"]}</th>
                        <th width="100"><input type="email" name="correo" required/></th>
                    </table>
                    <!--Direccion-->
                    <table>
                        <th width="100">${message["data6"]}</th>
                        <th width="100"><input  type="text" name="direccion" required/></th>
                    </table>
                    <!--Password-->
                    <table>
                        <th width="100">${message["data7"]}</th>
                        <th width="100"><input type="text" name="contra" required/></th>
                    </table>
                    <!--Tipo de documento-->
                    <table>
                        <th width="100">${message["data8"]}</th>
                        <th width="100"><input type="text" name="tipo_documento" required/> </th>
                    </table>
                    <!--Sexo-->
                    <table>
                        <th width="100">${message["data10"]}</th>
                        <th width="100"><input type="text" name="sexo" required/></th>
                    </table>

                    <input type="submit" value="Guardar" />
                </form>
                <c:if test="${user==false}">
                    <p>${message["sign1"]}</p>
                </c:if>
            </div>
        </c:if>

        <hr>
    </div> <!-- /container -->



</main>

<%@ include file="footer.jsp" %>