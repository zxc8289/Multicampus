<%@page import="java.io.PrintWriter"%>
<%@page import="weview.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
MemberDto mem = (MemberDto)request.getSession().getAttribute("login");
%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Weview - 요청하기</title>

<link href="resources/css/styles.css" rel="stylesheet" />

<link href="resources/css/styles.css" rel="stylesheet" />
<link rel="stylesheet" href="style.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<!-- 버튼 스타일 적용 자바 스크립트-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!--  <button type="button" class="btn btn-light">btn-light</button> -->

<style>
	.center{
		text-align: center;
		vertical-align: middle;
	}
	
	.submit{
		text-align: center;
		
	}
	.button{
	box-shadow: 0px 1px 1px -1px;
	padding: 0.5rem 0.4rem;
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
<h3 align="center">요청 영화 작성</h3>
<br>

<form action="reqwriteAf.do" name="savefrm" method="POST">

<table class="table table-hover" style="width:790px" align="center">

<tr>
	<th class="center" >아이디</th>
	<td align="center">
				<input type="text" name="id" size="90px"  value="<%=mem.getId()%>" readonly="readonly" >
	</td>
</tr>

<tr>
	<th class="center">제목</th>
	<td align="center">
		<input type="text" name="title" size="82px" class="form-control" placeholder="제목을 입력해주세요.">
	</td>
</tr>

<tr class="center">
	<th>내용</th>
	<td align="center">
		<textarea rows="17" cols="87" name="content" class="form-control" placeholder="요청하실 영화를 입력해주세요."></textarea>
	</td>
</tr>

</table>

<div class="submit">
<input type="button"   class="btn btn-light" value="글쓰기" onclick="save()">

<script>
function save(){
	if(confirm("저장하시겠습니까?") == true ){
		alert("저장되었습니다");
		document.savefrm.submit();
	}else{
		return;
	}
}
</script>
</div>


</form>
<br><br><br><br>

</body>
</html>