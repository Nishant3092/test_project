 <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
       <h2>User Information</h2>
      	 <form:form method = "POST"    action ="registerform" modelAttribute="regform">
         <table>
        	<tr>
                <td>First Name :</td>
               <td><form:input path = "firstname" /></td>
            </tr>
          
           
            <tr>
                <td>Last Name :</td>
               <td><form:input path = "lastname" /></td>
            </tr>
            
           
            
             <tr>
                <td>Mobile :</td>
               <td><form:input path = "mobile" /></td>
            <tr/>
            
            
            <tr>
                <td>Designation :</td>
               <td><form:input path = "designation" /></td>
            </tr> 
            <tr>
                <td>Email :</td>
               <td><form:input path = "email" /></td>
            </tr> 
            
            
         </table>  
         <input type="submit" value="submit" >
      </form:form> 
      
      
   </body>
    
</html>
