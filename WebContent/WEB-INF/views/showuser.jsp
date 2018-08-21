<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show User</title>

</head>
<body>
<c:forEach items="${userlist}" var="userjspr">

        
		 Fisrt Name:${userjspr.firstName} 
		 <br><br/>
		 Last Name :${userjspr.lastName}
		<br><br/>
		House No. :${userjspr.addrs.housenu}
		<br><br/>
		State Name:${userjspr.addrs.stateName} 
		
	</c:forEach>
 


<%-- Fisrt Name:${user.firstName}
<br><br/>
Last Name :${user.lastName}
<br><br/>
House No. :${user.addrs.housenu}
<br><br/>
State Name:${user.addrs.stateName} --%>


</body>
</html>