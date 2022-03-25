<%@page import="weview.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% MemberDto mem = (MemberDto)request.getSession().getAttribute("login"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
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

.profile-form {
	width: 760px;
	background: white;
	height: 880px;
	padding: 80px 40px;
	border-radius: 50px;
	position: absolute;
	left: 50%;
	top: 50%;
	transform: translate(-50%, -50%);
}

.profile-form h1 {
	text-align: center;
	margin-bottom: 60px;
}

.img {
	width: 150px;
	background: white;
	height: 150px;
	border-radius: 200px;
	border: solid; 0.5 px; black;
	display: inline-block;
}

.nick {
	display: inline-block;
}

.preferred{
	width: 600px;
	height: 250px;
	background: red;
	transform: translate(-50%, -50%);
	position: absolute;
	left: 50%;
	top: 55%;
	border-radius: 45px;
}
</style>

</head>
<body>
	<form method="post" class="profile-form">
		<h1>My page 테스트</h1>
		<div class="img"></div>
		<div class="nick">
			<p>닉네임:<%=mem.getNickname()%></p>
			<p>이메일:<%=mem.getEmail()%></p>
			<p></p>
		</div>
		<div class="preferred">선호 장르</div>
		<div class="want">보고싶은 작품</div>
	</form>
</body>
</html>