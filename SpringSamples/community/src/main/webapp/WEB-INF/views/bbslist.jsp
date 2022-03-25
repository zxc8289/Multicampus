<%@page import="mul.camp.a.dto.BbsDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!// 답글의 depth와 image 추가해 주는 함수
	// depth가 1일때 -> ' '->
	// depth가 2일때 -> '  '->
	public String arrow(int depth) {
		String res = "<img src='image/arrow.png' width='20px' height='20px' />";
		String nbsp = "&nbsp;&nbsp;&nbsp;&nbsp;";

		String ts = "";
		for (int i = 0; i < depth; i++) {
			ts += nbsp;
		}
		return depth == 0 ? "" : ts + res; // depth가 0이였을때 아무것도 주지말고, 0이아닐때 ts + res 를 줘라 여백 이미지
	}%>

<%
List<BbsDto> bbslist = (List<BbsDto>) request.getAttribute("bbslist");
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
</head>
<body>

	<h1>게시판</h1>
	
	<div align="center">
		<div style="width: 1000px" align="right">
		<select id="choice">
			<option value="title">제목</option>
			<option value="content">내용</option>
			<option value="writer">작성자</option>
		</select> <input type="text" id="search" value="">
		<button type="button" onclick="searchBbs()">검색</button>
		</div>
		
		
		<!-- attribute property -->
		<table class="table table-hover" style="width: 1000px">
			<!--  <col width="30"><col width="150"><col width="80"> -->

			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>정보</th>
					<th>작성자</th>
				</tr>
			</thead>

			<tbody>
				<%
				if (bbslist == null || bbslist.size() == 0) {
				%>
				<tr>
					<td colspan="3">작성된 글이 없습니다.</td>
				</tr>
				<%
				} else {
				for (int i = 0; i < bbslist.size(); i++) {
					BbsDto bbs = bbslist.get(i);
				%>
				<tr>
					<th><%=i + 1%></th>
					<td><%=arrow(bbs.getDepth())%> <a
						href="bbsdetail.do?seq=<%=bbs.getSeq()%>"> <%=bbs.getTitle()%></a>
					</td>
					<td><%=bbs.getRef()%>-<%=bbs.getStep()%>-<%=bbs.getDepth()%></td>
					<td align="center"><%=bbs.getId()%></td>
				</tr>
				<%
				}
				}
				%>
			</tbody>

		</table>

		<br>
		<div align="center">
			<a href="bbswrite.do">글 쓰기</a>
		</div>

	</div>

	<script type="text/javascript">
		function searchBbs(){
			let choice = document.getElementById("choice").value;
			let search = document.getElementById("search").value;
			
			location.href = "bbslist.do?choice=" + choice + "&search=" + search;
		}
		
	</script>


</body>
</html>