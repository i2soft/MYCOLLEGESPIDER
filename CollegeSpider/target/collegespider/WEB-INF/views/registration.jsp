<%@taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>




<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="css/mycss.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.11.2.js"></script>

<script src="js/angular.js"></script>
<script src="js/myjs.js"></script>
<script type="text/javascript" src="js/infinite-rotator.js"></script>
<script src="js/bootstrap.js"></script>

</head>
<body>


<div class="container">
<%@ include file="header.jsp" %>

<s:form id="registrationForm" modelAttribute="registrationBean" method="POST">


Name <input type="text" name="name"/> <br/>
Email Id <input type="text" name="email"/> <br/>
Password <input type="password" name="password"/> <br/>
Type <input type="text" name="usertype"/> <br/>
<input type="submit" value="submit">

</s:form>

<%@ include file="footer.jsp" %>



</div>




</body>
</html>