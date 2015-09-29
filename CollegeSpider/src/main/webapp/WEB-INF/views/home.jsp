<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College Spider</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.11.2.js"></script>
<script src="js/bootstrap.js">
	
</script>


</head>
<body>
<div>
		<div class="container">

			<!--header starts here-->
			<%@ include file="header.jsp" %>
			<!--header ends here-->

           <jsp:include page="space.jsp"></jsp:include>

			<!--menu starts here-->
			
			<%@ include file="home_menu_main.jsp" %>
			<!--menu ends here-->

			<!--body starts here-->
			<jsp:include page="home_body.jsp"></jsp:include>

			<!--body ends here-->


			<br/>


			<!--footer starts here-->

			<%@ include file="footer.jsp" %>

			<!--footer ends here-->
		
	</div>

</div>



</body>
</html>