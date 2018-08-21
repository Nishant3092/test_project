<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Success Page</title>
</head>
<body>
User Details
<hr>
First Name   : <c:out value="${Userreg.firstname}"></c:out> <br/>
Last Name    : <c:out value="${Userreg.lastname}"></c:out> <br/>
Mobile No.   : <c:out value="${Userreg.mobile}"></c:out> <br/>
Designation  : <c:out value="${Userreg.designation}"></c:out> <br/>
Email        : <c:out value="${Userreg.email}"></c:out> <br/>



</body>
</html>