<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<body>
<h1>Spring MVC + Embedded database example</h1>

<h2>${msg}</h2>

<c:forEach var="u" items="${user}">
	<li>${ fn:toUpperCase(u.name) }</li>
</c:forEach>

</body>
</html>