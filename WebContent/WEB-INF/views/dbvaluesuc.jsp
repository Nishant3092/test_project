<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dynamic Home PAGE</title>
</head>
<body>

 <c:forEach  items="${userList}"  var="user" > 
 <table> 
        <tr>  
         <td>${user.userId}</td>  
        <td>${user.firstname}</td>  
         <td>${user.lastname}</td>  
         <td>${user.designation}</td>  
         <td>${user.mobile}</td>  
          <td>${user.email}</td> </tr> 
           </c:forEach> 
           </table>
</body> 

</body>
</html>