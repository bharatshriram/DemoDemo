<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/jpg" href="images/hanbit.png">
<link rel="stylesheet" href="resources/files/login/css/login.css" type="text/css" media="all" />
<script src="resources/files/common/js/bootstrap.js"></script>
<script src="resources/files/common/js/jquery.min.js"></script>
<script src="resources/files/common/js/bootstrap.min.js"></script>
<script src="resources/files/common/js/bootbox.min.js"></script>
<script src="resources/files/common/js/bootbox.js"></script>

<link rel="stylesheet" href="resources/files/common/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/files/common/css/bootstrap.css">

</head>
<body>
<div id="main_Body">
<!--header-->
	<div class="header-w3l">
	<!-- 	<h1>
			<span>PaySlip</span>Login<span>Form</span>
		</h1> -->
	</div>
	<!--//header-->
	<div class="main-content-agile">
		<div class="sub-main-w3">
			<h2>Login</h2>
			<form action="#" method="post">
				<label>UserID</label>
				<div class="pom-agile">
					<span class="fa fa-user-o" aria-hidden="true"></span>
					<input placeholder="Username" id="user_id" name="Name" class="user" type="text" required="">
				</div>
				<label>Password</label>
				<div class="pom-agile">
					<span class="fa fa-key" aria-hidden="true"></span>
					<input placeholder="Password" id="user_password" name="Password" class="pass" type="password" required="">
				</div>
				<div class="sub-w3l">
				
				</div>
				
				<div class="right-w3l">
				
				<a href='forgot.jsp' id="forgot">Forgot Password?</a>
				
					<input type="submit" value="LogIn" id="login">
				</div>
			</form>
		</div>
	</div>
	<!--//main-->
	</div>
</body>
</html>