<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="weview.dto.ReqDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% ReqDto req = (ReqDto)request.getAttribute("req"); %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weview - 요청 게시글</title>

<link href="resources/css/styles.css" rel="stylesheet" />

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

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

<br><br>
<h3 align="center">요청 영화</h3>
<br>

<div align="center">

<table class="table table-hover " style ="width: 800px" align="center">

<tr>
	<th class="center">작성자</th>
	<td ><%=req.getId() %></td>
</tr>


<tr>
	<th class="center">제목</th>
	<td><%=req.getTitle() %></td>
</tr>


<tr>
	<th class="center">작성일</th>
	<td ><%=req.getCreated() %></td>
</tr>


<tr class="center">
	<th>내용</th>
	<td align="center">
		<div class="form-group">
			<textarea rows="15" cols="88"  class="form-control" readonly="readonly"><%=req.getContent() %></textarea>
		</div>
	</td>		
</tr>	

</table>
</div>
<br>


<form class="center" method="POST">
	<input  type="button"  class="btn btn-light"  value="목록" onclick="location.href = 'reqdetailAf.do'" >
	<input  type="button"  class="btn btn-light"  value="수정" onclick="location.href = 'reqmodify.do?seq_request=<%=req.getSeq_request() %>'" >
</form>





</body>
</html>