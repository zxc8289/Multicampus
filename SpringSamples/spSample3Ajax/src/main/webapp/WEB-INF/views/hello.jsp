<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h2>hello.jsp 입니다.</h2>

<p id="demo">안녕하세요</p>
<h3>반갑습니다</h3>
<div>건강하세요</div>


<input type = "txt" id="test" value ="hi good">
<script type="text/javascript">

/*
// DOM
let demo = document.getElementById("demo").innerHTML;
//document.getElementsByTageName()
//document.getElementsByClassName()
console.log(demo);

document.getElementById("demo").innerHTML = "nice to meet you";
*/

/*
let demo = $("#demo").html();
console.log(demo);
//$("#demo").text()
*/

/*
let test = $("#test").val();
console.log(test);

$("#test").val("hello nice");			// setter
*/


</script>

<button type="button" onclick="btnclick()">자바스크립트 버튼입니다.</button>

<script type="text/javascript">
function btnclick(){
	alert("버튼 클릭!");
}
	
</script>

<button type="button" id="btn">제이쿼리 버튼입니다.</button>

<script type="text/javascript">
$("#btn").click(function (){
	alert("btn 클릭!");
});
</script>

</body>
</html>