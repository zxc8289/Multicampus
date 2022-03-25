<%@page import="mul.camp.a.dto.MemberDto"%>
<%@page import="mul.camp.a.dto.BbsDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
BbsDto data = (BbsDto) request.getAttribute("data");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style type="text/css">
th {
	text-align: center;
}
</style>
</head>
<body>
	<h2>작성 글 상세보기</h2>
	<div align="center">

		<!-- attribute property -->
		<table class="table table-hover" border="1" style="width: 1000px">


			<tr>
				<th>작성자</th>
				<td><%=data.getId()%></td>

			</tr>
			<tr>
				<th>제목</th>
				<td><%=data.getTitle()%></td>
			</tr>
			<tr>
				<th>작성일</th>
				<td><%=data.getWdate()%></td>
			</tr>
			<tr>
				<th>조회수</th>
				<td><%=data.getReadcount()%></td>
			</tr>
			<tr>
				<th>정보</th>
				<td><%=data.getRef()%>-<%=data.getStep()%>-<%=data.getDepth()%></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="15" cols="100" readonly="readonly"><%=data.getContent()%></textarea></td>
			</tr>
		</table>

		<%
		MemberDto mem = (MemberDto) request.getSession().getAttribute("login"); // 로그인한사람의 정보
		%>
		<button type="button" onclick="answerbbs(<%=data.getSeq()%>)">댓글</button>
		<%
		if (mem.getId().equals(data.getId())) {
		%>
		<button type="button" onclick="updatebbs(<%=data.getSeq()%>)">수정</button>
		<button type="button" onclick="deletebbs(<%=data.getSeq()%>)">삭제</button>
		<%
		}
		%>



	</div>

	<script type="text/javascript">
	function answerbbs(seq){
		location.href = "answer.do?seq=" +seq;
	}
	
	function updatebbs(seq){
		location.href = "updatebbs.do?seq=" +seq;
	}
	
	function deletebbs(seq){
		location.href = "deletebbs.do?seq=" +seq;
	}
	</script>

</body>
</html>