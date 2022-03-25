<%@page import="weview.dto.ReqDto"%>
<%@page import="weview.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
MemberDto mem = (MemberDto)request.getSession().getAttribute("login");
%>        
<% ReqDto req = (ReqDto)request.getAttribute("req"); %>   

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Weview - 요청 수정</title>

<link href="resources/css/styles.css" rel="stylesheet" />

<!-- 버튼 스타일 적용 자바 스크립트-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!--  <button type="button" class="btn btn-light">btn-light</button> -->


<link href="resources/css/styles.css" rel="stylesheet" />
<link rel="stylesheet" href="style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


<style>
	.center{
		text-align: center;
		vertical-align: middle;
	}
	.button{
	backgroundcolor: rgb(212, 237, 218);
	box-shadow: 0 2px 2px -1px;
	padding: 0.2rem 0.4rem;
	}
</style>


</head>
<body>


<jsp:include page="includes/navigation.jsp" />

<%
	if(session.getAttribute("login") == null) {
		/* session.setAttribute("loginMsg", "게시물 작성은<br>로그인이 필요합니다."); */

		response.sendRedirect("loginer.do");
		return;
	}
%> 

<br><br>
<h3 align="center">수정 Page</h3>
<br>

<form action="reqmodifyAf.do" name="updatefrm" method="GET">
<input type="hidden" name="seq_request" value="<%=req.getSeq_request() %>">

<table class="table table-hover"  style="width:800px"  align="center">

<tr>
	<th class="center">아이디</th>
	<td align="center">
			<input type="text" name="id" size="86px"  class="form-control" value="<%=mem.getId()%>" readonly="readonly">
	</td>
</tr>

<tr>
	<th class="center">제목</th>
	<td align="center" >
		<input type="text" name="title" size="86px"  class="form-control"  value="<%=req.getTitle()%>" >
	</td>
</tr>

<tr>
	<th class="center">내용</th>
	<td align="center">
		<textarea rows="17" cols="88" name="content" class="form-control" ><%=req.getContent() %></textarea>
	</td>
</tr>

</table>


<div class="center">
<input type="button"  class="btn btn-light" value="수정" onclick="update()">

<script>
function update(){
	if(confirm("저장하시겠습니까?") == true ){
		alert("수정되었습니다");
		document.updatefrm.submit();
	}else{
		return;
	}
}
</script>
</div>


</form>
<br><br><br>

</body>
</html>