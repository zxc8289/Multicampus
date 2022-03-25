<%@page import="mul.camp.a.dto.MemberDto"%>
<%@page import="mul.camp.a.dto.BbsDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
BbsDto bbs = (BbsDto) request.getAttribute("bbs");
%>

<%
// session에서 사용자 정보를 산출
MemberDto mem = (MemberDto) request.getSession().getAttribute("login");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>

	
	<div align="center">
		<h1>부모글</h1>
		<!-- attribute property -->
		<table class="table table-hover" border="1" style="width: 1000px">
			<tr>
				<th>작성자</th>
				<td><%=bbs.getId()%></td>

			</tr>
			<tr>
				<th>제목</th>
				<td><%=bbs.getTitle()%></td>
			</tr>
			<tr>
				<th>작성일</th>
				<td><%=bbs.getWdate()%></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="15" cols="100" readonly="readonly"><%=bbs.getContent()%></textarea></td>
			</tr>
		</table>

		<h1>댓글</h1>
		<form action="answerAf.do" method="get">
			<!-- 부모글에 대한 시퀀스 -->
			<input type="hidden" name="seq" value="<%=bbs.getSeq()%>">

			<table class="table table-hover" border="1" style="width: 1000px">
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" size="70px"
						value="<%=mem.getId()%>" readonly="readonly"> <!-- readonly 아이디변경불가 -->
					</td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" size="70px"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea rows="20" cols="80" name="content"></textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="글쓰기"></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>