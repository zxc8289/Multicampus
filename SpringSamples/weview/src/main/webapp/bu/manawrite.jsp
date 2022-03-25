<%@page import="weview.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
MemberDto mem = (MemberDto)request.getSession().getAttribute("login");
%>       
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weview - 관리자 페이지</title>

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
	.poster{		
		width: 200px;
		height: 280px;
		background-size: cover; 
	}
	.array{
		display: flex;
		flex-wrap: wrap;
		width: 200px;
		margin: 0 auto;
		justify-content: center;
		vertical-align: center;
	}


</style>



</head>
<body>

<br><br>
<h3 align="center">영화 작성(관리자 전용)</h3>
<br>

<form action="manawriteAf.do" name="savefrm" method="POST"  enctype="multipart/form-data">

<table class="table table-hover" style="width:650px" align="center">


<tr>
	<th rowspan="5">
	 <div class="select_img">
 		<img src="" /> <input type="file" id="poster" name="file" />
 	</div>
 	</th>
	<td colspan="2">
		<input type="text" name="title" size="20px" placeholder="영화 제목">
	</td>
	<td colspan="1">
		<input type="text" name="rate" size="10px" placeholder="평점">
	</td>
	<td colspan="1">
		<input type="text" name="age" size="10px" placeholder="연령제한">
	</td>
</tr>

<tr>
	<td>
		<input type="text" name="genre" size="10px" placeholder="장르">
	</td>
	<td>
		<input type="text" name="country" size="10px" placeholder="국가">
	</td>
	<td>
		<input type="text" name="runningtime" size="10px" placeholder="러닝타임">
	</td>
	<td>
		<input type="text" name="created" size="20px" placeholder="개봉일자">
	</td>
</tr>

<tr>
	<td colspan="4">
		<input type="text" name="director" size="10px" placeholder="감독">
	</td>
</tr>

<tr>
	<td colspan="4">
		<input type="text" name="actor" size="20px" placeholder="배우">
	</td>
</tr>	

<tr>
	<td colspan="4">
		<input type="text" name="trailer" size="20px" placeholder="예고편">
	</td>
</tr>	

 <tr>
	<td colspan="5">
		<textarea rows="3" cols="100" name="story" placeholder="줄거리"></textarea>
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

 
 <script>
  $("#poster").change(function(){
   if(this.files && this.files[0]) {
    var reader = new FileReader;
    reader.onload = function(data) {
     $(".select_img img").attr("src", data.target.result).width(200).height(280);        
    }
    reader.readAsDataURL(this.files[0]);
   }
  });
 </script>





</form>
<br><br><br><br>





</body>
</html>