<%@ include file="header.jsp" %>
<h3>${messages["list_p"]}</h3>
<c:if test="${!empty airlines}">
   <table class="tg">
   <tr>
       <th width="120">Name</th>
       <th width="120">Sede</th>
       <th width="120">Calificación Promedio</th>
   </tr>
   <c:forEach items="${airlines}" var="air">
       <tr>
           <td>${air.getNombre()}</td>
           <td>${air.getSede()}</td>
           <td>${air.getCalPromedio()}</td>
       </tr>
   </c:forEach>
   </table>
</c:if><%@ include file="footer.jsp" %> 
