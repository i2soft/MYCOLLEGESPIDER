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
			<jsp:include page="header.jsp"></jsp:include>
			<!--header ends here-->

           <jsp:include page="space.jsp"></jsp:include>

			<!--menu starts here-->
			<jsp:include page="home_menu_main.jsp"></jsp:include>
			<!--menu ends here-->

			<!--body starts here-->
			<h1>News</h1>
			<!--body ends here-->


			<br/>


			<!--footer starts here-->

			<jsp:include page="footer.jsp"></jsp:include>

			<!--footer ends here-->
		
	</div>

</div>



</body>
</html>