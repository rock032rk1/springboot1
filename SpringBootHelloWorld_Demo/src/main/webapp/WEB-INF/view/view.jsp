<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 
</head>
<body>
    <h2>Student Result</h2>
    <table class="table table-hover">
                <thead>
                 <tr>
                   <th>ID</th>
                   <th>Name</th>
                   <th>Mobile</th>
                   <th>Email</th>
                 </tr>
                </thead>
                <tbody>
            <c:forEach var="stu" items="${stud }">
           <tr>
             <td>${stu.sid }</td>
             <td>${stu.name }</td>
             <td>${stu.mobile }</td>
             <td>${stu.email }</td>
            <td><a href="delete?sid=${stu.sid }" class="btn btn-danger delBtn">Delete</a></td>
             <td><a href="find?sid=${stu.sid }" class="btn btn-primary eBtn">Edit</a></td>   
           </tr>
         </c:forEach>
                </tbody>
              </table>

</body>
</html>