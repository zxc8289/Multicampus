<%@page import="weview.dto.MemberDto"%>
<%@page import="weview.dto.ReqDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 List<ReqDto> reqlist = (List<ReqDto>)request.getAttribute("reqlist");
 
 %>   

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weview - 요청 게시판</title>

<link href="resources/css/styles.css" rel="stylesheet" />

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&display=swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&display=swap" rel="stylesheet">

<!-- 버튼 스타일 적용 자바 스크립트-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!--  <button type="button" class="btn btn-light">btn-light</button> -->

<style>
h2{															 /*h2 클래스 변경*/
	font-family: 'Nanum Gothic Coding', monospace;}
.writer{ 													/*작성자 컬러 변경*/
	font-family: 'Nanum Gothic Coding', monospace;
	color:#6C7A89;
}
.linkstyle{													/*영화제목 컬러 변경, 폰트는 적용 안된다.*/
font-family: font-family: 'Black Han Sans', sans-serif;
color:#6C7A89;
}
.array{
	display: flex;											/* 수평 정렬 */
	flex-wrap: wrap;									/* 한줄에 목차가 차면 다음줄로 넘어감 */ 
	width:900px;
    margin: 0 auto;
    justify-content: center;
}
.list{
    width: 250px;
    height: 200px;
    border-radius: 100px;
    background-color: #e0f8f75e;
    text-align: center;
    margin: 15px;    
    display:flex;
    flex-direction: column;
}

.list:hover{
	background-color: #CCF2F4;
	border-bottom: 15px solid #A4EBF3;
}

.center{
	text-align: center;
}
.button{
	backgroundcolor: rgba(255, 110, 97, 0.358);
	box-shadow: 0 2px 2px -1px;
	padding: 0.2rem 0.4rem;
}

</style>

</head>
<body>


<jsp:include page="includes/navigation.jsp" />

<!--  요청 게시판 목차 부분 -->

<br><br><br>
<h2 align="center">요청 게시판</h2>
<br>

<form class="center" method="POST">
	<input  type="button"  class="btn btn-light"  value="요청하기" onclick="location.href = 'reqwrite.do'" >
</form>


<div class="array" >

<%
if(reqlist == null || reqlist.size() == 0){	
%>

<span> 작성된 글이 없습니다. </span>	
	
	

<%
}else{
	 for(int i = 0; i < reqlist.size(); i++){
		 ReqDto req = reqlist.get(i); 
%>
 
<div class="list">
	<div style="flex-grow:3"></div>
	<div style="flex-grow:3 ">
		<a class="linkstyle" href="reqdetail.do?seq_request=<%=req.getSeq_request() %>"  >
		<span style="font-size: 25px"><%=req.getTitle() %></span></a>
	</div>
		<span class="writer" style="flex-grow:1">작성자.<%=req.getId() %></span>
		<span class="writer" style="flex-grow:1"><%=req.getCreated() %></span>
</div>

		
		
<%
	 }
}
%>

</div>
<br>



</body>
</html>