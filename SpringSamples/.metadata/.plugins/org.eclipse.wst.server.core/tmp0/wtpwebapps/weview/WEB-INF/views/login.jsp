<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Weview - 로그인</title>
<link rel="stylesheet" href="style.css">
<link
	href="https://fonts.googleapis.com/css?family=Nanum+Gothic+Coding|Noto+Sans+KR|Roboto&display=swap"
	rel="stylesheet">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<style>
* {
	margin: 0;
	padding: 0;
	text-decoration: none;
	font-family: 'Baskervville', serif;
	box-sizing: border-box;
}

body {
	min-height: 100vh;
	background-image: linear-gradient(120deg, #bdc3c7, #ecf0f1, #bdc3c7);
}

a {
	font-size: 15px;
	color: cornflowerblue;
}

.login-form {
	width: 360px;
	background: white;
	height: 580px;
	padding: 80px 40px;
	border-radius: 10px;
	position: absolute;
	left: 50%;
	top: 50%;
	transform: translate(-50%, -50%);
}

.login-form h1 {
	text-align: center;
	margin-bottom: 60px;
}

.txtb {
	border-bottom: 2px solid #adadad;
	position: relative;
	margin: 30px 0;
}

.txtb input {
	font-size: 15px;
	color: #333;
	border: none;
	width: 100%;
	outline: none;
	background: none;
	padding: 0 5px;
	height: 40px;
	font-family: 'Roboto', sans-serif;
}

.txtb span::before {
	content: attr(data-placeholer);
	position: absolute;
	top: 50%;
	left: 5px;
	color: #adadad;
	transform: translateY(-50%);
	left: 5px;
	transition: .5s;
}

.txtb span::after {
	content: '';
	position: absolute;
	width: 0%;
	height: 2px;
	background: linear-gradient(120deg, #95a5a6, #bdc3c7);
	transition: .5s;
}

.focus+span::before {
	top: -5px;
}

.focus+span::before {
	width: 100%;
}

.logbtn {
	display: block;
	width: 100%;
	height: 50px;
	border: none;
	background: linear-gradient(120deg, #bdc3c7, #95a5a6, #bdc3c7);
	background-size: 200%;
	color: #fff;
	outline: none;
	cursor: pointer;
	transition: .5s;
}

.logbtn:hover {
	background-position: right;
}

.button-text {
	margin-top: 60px;
	text-align: center;
	font-size: 13px;
}

.up {
	font-family: 'Roboto', sans-serif;
}

.down {
	font-family: 'Roboto', sans-serif;
	color: gray;
}

span {
	font-family: 'Roboto', sans-serif;
}
</style>

</head>
<body>
	<form action="loginAf.do" method="post" class="login-form">
		<h1 >Login</h1>

		<div class="txtb">
			<input type="text" id="id" name="id"> <span data-placeholer="Username"></span>
		</div>

		<div class="txtb">
			<input type="password" name="pwd" id="pwd"> <span data-placeholer="Password"></span>
		</div>
		<input type="submit" class="logbtn" value="Login"
			style="font-family: 'Roboto', sans-serif;" style="font-size: 15px;">

		<div class="button-text">
			<h3 class="up" style="color: rgb(75, 73, 73);">Don't have
				account?</h3>
			<br> <a href="regi.do" class="up">회원가입</a><br>
			<br> <br>
			<a href="mainpage.do" class="down">Return</a>
		</div>
	</form>

	<script type="text/javascript">
		$(".txtb input").on("focus", function() {
			$(this).addClass("focus");
		});

		$(".txtb input").on("blur", function() {
			if ($(this).val() == "")
				$(this).removeClass("focus");
		});
	</script>
</body>
</html>