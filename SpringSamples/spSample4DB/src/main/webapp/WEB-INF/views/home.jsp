<%@page import="weview.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보 페이지입니다.</h1>

	<%
	MemberDto mem = (MemberDto) request.getAttribute("mem");
	%>

	<h3><%=mem.getId()%>의 회원정보
	</h3>
	ID :
	<%=mem.getId()%><br> PW :
	<%=mem.getPwd()%><br> NAME :
	<%=mem.getName()%><br> EMAIL :
	<%=mem.getEmail()%><br>

	<h4>home.jsp</h4>
	<form action="world.do">
		ID <input type="text" name="id"> <br> 
		PW <input type="text" name="pw"> <br>
		NAME <input type="text" name="name"> <br>
		EMAIL <input type="text" name="email"><br>
		<input type="submit" value="account">
	</form>

</body>