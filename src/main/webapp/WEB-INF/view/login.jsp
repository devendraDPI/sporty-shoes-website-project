<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>     
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sporty Shoes - Login</title>
</head>
<body>
<jsp:include page="/WEB-INF/view/components/header.jsp" ></jsp:include>
<jsp:include page="/WEB-INF/view/components/topbar.jsp" ></jsp:include>

${error}

<form name=frmLogin action="loginaction" method="post">
	
 <table border=1 cellspacing=2 cellpadding=4>
 	<tr>
 		<td width=25%>Email id*</td>
 		<td><input name=email_id maxlength=50></td>
 	</tr>
 	<tr>
 		<td width=25%>Password*</td>
 		<td><input name=pwd maxlength=10 type="password"></td>
 	</tr>
 	<tr>
 		<td colspan=2>
 			<button>Login</button><br>
 			<a href="signup">Not a member? Signup</a>
 		</td>
 	</tr>
 </table>
</form>
<jsp:include page="/WEB-INF/view/components/footer.jsp"></jsp:include>
</body>
</html>