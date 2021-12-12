<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>     
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin - Browse Members</title>
</head>
<body>
<jsp:include page="/WEB-INF/view/components/admin-header.jsp" ></jsp:include>
<jsp:include page="/WEB-INF/view/components/admin-topbar.jsp" ></jsp:include>

Total Members: ${list.size() }

<table border=1 cellspacing=2 cellpadding=4>
 	<tr>
 		<td><b>Name</b></td>
 		<td><b>Email</b></td>
 		<td><b>Signup Date</b></td>
 		<td><b>Age</b></td>
 		<td><b>Address</b></td>
 	</tr>
 	<c:forEach items="${list}" var="item">
 	  	<tr>
	 		<td>${item.fname}&nbsp;${item.lname }</td>
 			<td>${item.email}</td>
 			<td>${item.dateAdded}</td>
 			<td>${item.age}</td>
 			<td>${item.address}</td>
 			
 	  	</tr>
 	  </c:forEach>
</table> 		
	


<jsp:include page="/WEB-INF/view/components/admin-footer.jsp"></jsp:include>
</body>
</html>