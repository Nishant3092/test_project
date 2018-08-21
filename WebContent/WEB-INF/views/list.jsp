
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h1>Learning List Collection</h1>

	${list}


<ul>

			<c:forEach var="userlist" items="${userlist}">
			<br>${userlist}<br/>	
			</c:forEach>
			<li>Collection Concepts<li/>
		</ul>
	
</body>
</html>